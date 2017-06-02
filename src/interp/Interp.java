/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import commons.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * corresponding to the function.
     */
    private HashMap<String,BbTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**Stores the current playing speed of the piece.
     * Can be changed in runtime and it's used to calculate the duration of each note
     */
    private int  speed = 1;
    
    private int vol = 0;
    
    /**
     * List of playable data to transform into MIDI
     * When a PLAYABLE type node is reached, the Data it represents is added to this array
     * 
     */
    private ArrayList<Data> music = new ArrayList<Data>();

	private int instrument = 0; 
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(BbTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing of the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null);
        writeMIDI();
        //play midi maybe?
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(BbTree T) {
        assert T != null && T.getType() == BbLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,BbTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            BbTree f = T.getChild(i);
            assert f.getType() == BbLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See BbTree.java for details.
     */
    private void PreProcessAST(BbTree T) {
        if (T == null) return;
        switch(T.getType()) {
	        case BbLexer.INT: T.setIntValue(); break;
	        case BbLexer.STRING: T.setStringValue(); break;
	        case BbLexer.BOOLEAN: T.setBooleanValue(); break;
            case BbLexer.NOTE: T.setPitchValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(BbTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, BbTree args) {
        // Get the AST of the function
        BbTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the called function
        BbTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (BbTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (BbTree t) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value

        // A big switch for all type of instructions
        switch (t.getType()) {
        	
	        // Assignment
	        case BbLexer.ASSIGN:
	            value = evaluateExpression(t.getChild(1));
	            Stack.defineVariable (t.getChild(0).getText(), value);
	            return null;
            
            //Note assignment
            case BbLexer.NOTEASSIGN:
            	value = evaluateMusicNotation(t.getChild(1));
            	//d(value,t.getChild(0).getText());
            	Stack.defineVariable(t.getChild(0).getText(), value);
            	return null;

            // If-then-else
            case BbLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case BbLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null)  return r;
                }
                
            //TODO
            case BbLexer.FOR:
            	return null;
            	
            // Function call
            case BbLexer.FUNCALL:
            	executeFunction(t.getChild(0).getText(), t.getChild(1));
            	return null;
            // Return
            case BbLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data
                
            //Playable
            case BbLexer.PLAYABLE:
            	ArrayList<Data> aux = evaluatePlayable(t);
            	//System.out.format("aux is " + aux.toString()+"\n");
            	music.addAll(aux);
            	//System.out.format("music is "+music.toString()+"\n");
            	return null;
            	
        	// Read statement: reads a variable and raises an exception
            // in case of a format error.
            case BbLexer.READ:
                String token = null;
                Data val = new Data(0);;
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case BbLexer.WRITE:
                BbTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == BbLexer.STRING) {
                    System.out.format(v.getStringValue());
                    return null;
                }

                // Write an expression
                System.out.print(evaluateExpression(v).toString());
                return null;
            	
            //Speed
            case BbLexer.SPEED:
            	speed = t.getChild(0).getIntValue();
            	return null;
            case BbLexer.INSTRUMENT:
            	instrument = t.getChild(0).getIntValue();

            	return null;
            	
            case BbLexer.VOL:
            	vol = t.getChild(0).getIntValue();
            	//volume should be between 0 and 127
            	vol = Integer.min(vol,127);
            	vol = Integer.max(vol,0);
            	return null;
            	
            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }

	@SuppressWarnings("unused")
	private void d(Object value, String string) {
		// TODO Auto-generated method stub
		System.out.println(string+": "+value.toString());
	}

	/**
     * Evaluates the music notation represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
    private Data evaluateMusicNotation(BbTree t) {
        assert t != null;
        
        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();
        
        Data value = null;
        
        switch (type) {
        	//A note variable
        	case BbLexer.NOTEID:
        		String name = t.getText();
        		if(! Stack.definedVariable(name))
        			throw new RuntimeException ("Variable "+name+" is not defined");
        		else{
        			value = new Data(Stack.getVariable(name));
        		}
        		break;
        	case BbLexer.NOTE:
        		Note n = new Note(t.getPitchValue());
        		value = new Data(n);
				value.setInstrument(instrument );
				value.setVolume(vol);
        		break;
        	case BbLexer.CHORD:
        		ArrayList<Integer> notes = new ArrayList<Integer>();
        		for(int i = 0; i < t.getChildCount(); ++i){
        			if(t.getChild(i).getType() == BbLexer.NOTE) notes.add(t.getChild(i).getPitchValue());
        			else{
        				Data d = new Data(evaluateMusicNotation(t.getChild(i)));
        				if(!d.isNote()) throw new RuntimeException("Variable "+ t.getChild(i).getText() +" is not a note!");
        				Note no = new Note(d.getNoteValue());
        				notes.add(no.getPitch().get(0));
        			}
        		}
        		Chord c = new Chord(notes);
        		value = new Data(c);
				value.setInstrument(instrument );
				value.setVolume(vol);
        		break;
        	case BbLexer.MELODY:
        		int instrument = t.getChild(0).getIntValue();
        		ArrayList<Sound> sounds = new ArrayList<Sound>();
        		for (int i = 1; i < t.getChildCount(); ++i){
        			ArrayList<Data> d = evaluatePlayable(t.getChild(i));
        			//d(d, "evaluated playable");
        			for(int j = 0; j < d.size(); ++j){
        				if (!(d.get(j).isChord() || d.get(j).isNote())) throw new RuntimeException("Variable must be a note or chord");
        				Sound s = d.get(j).getSound();
        				s.setInstrument(instrument);
        				s.setVolume(vol);
        				sounds.add(s);
        			}
        		}
        		Melody m = new Melody(sounds);
        		value = new Data(m);
        		break;
        	case BbLexer.POLIFONE:
        		ArrayList<Melody> voices = new ArrayList<Melody>();
        		for(int i = 0; i < t.getChildCount(); ++i){
        			Data d = evaluateMusicNotation(t.getChild(i)); //should return melody
        			if(!d.isMelody())
        				throw new RuntimeException ("Variable "+t.getChild(i).getText()+" is not a MELODY");
        			Melody mel = new Melody(d.getMelodyValue());
        			voices.add(mel);
        		}
        		Polifony p = new Polifony(voices);
        		value = new Data(p);
        		break;
        	case BbLexer.PLUS:
        		Data left = new Data(evaluateMusicNotation(t.getChild(0)));
        		Data right = new Data(evaluateExpression(t.getChild(1)));
        		assert(right.isInteger());
        		left.raisePitch(right.getIntegerValue());
        		value = left;
        		break;

        		
        }
        setLineNumber(previous_line);
        return value;
	}

	private ArrayList<Data> evaluatePlayable(BbTree t) {
		assert t != null;
        
        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getChild(0).getType();
        
        ArrayList<Data> values = new ArrayList<Data>();
        Data data = null;
        double duration = 0;
        switch (type) {
        	//A note variable
        	case BbLexer.NOTEID:
        	case BbLexer.CHORD:
        	case BbLexer.NOTE:
        	case BbLexer.PLUS:
        		data = evaluateMusicNotation(t.getChild(0));
        		if (data.isChord() || data.isNote()){
        			duration = evaluateDuration(t);
        			data.setDuration(duration);
        		}
        		//System.out.format("duration: "+Double.toString(duration));
        		values.add(data);
        		//System.out.format(values.toString());
        		break;
        	case BbLexer.PACK:
        		duration = evaluateDuration(t);
        		for (int i = 0; i < t.getChild(0).getChildCount(); ++i){
        			d(i, "looking at pos");
        			d(values, "values BEFORE");
        			data = new Data(evaluateMusicNotation(t.getChild(0).getChild(i)));
        			d(data.getSound(), "data is");
        			data.setDuration(duration);
        			values.add(data);
        			d(values, "values AFTER");
        		}
        		break;
        	case BbLexer.MELODY:
        		return null;
        	case BbLexer.POLIFONE:
        		return null;
        	
        }
        setLineNumber(previous_line);
        return values;
	}
	
	
	/*
	 * 1  ->  4  beats
	 * 2  ->  2  beats
	 * 4  ->  1  beat
	 * 8  -> 1/2 beat
	 * 16 -> 1/4 beat
	 * etc.
	 */

	/** 
	 * Evaluates the duration of the playable represented in AST t
	 * @param t is a PLAYABLE node 
	 * @return The value of the duration in seconds
	 * 
	 * */
	private double evaluateDuration(BbTree t) {
        assert t != null;
        assert(t.getChildCount() >= 2);
		double beat = 60.0/(double)speed; //duration of a beat (in seconds)
		//System.out.format(" Speed:"+Integer.toString(speed));
		///System.out.format(" Beat:"+Double.toString(beat));
		double times = 4.0/(double)t.getChild(1).getIntValue(); //number of beats for note
		//System.out.format(" times:"+Double.toString(times));
		double duration = beat * times;
		if(t.getChildCount() > 2) duration += duration/2; //has a dot
		//System.out.format(" Duration:"+Double.toString(duration));
		return duration;
	}

	/**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(BbTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case BbLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            // An integer literal
            case BbLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A Boolean literal
            case BbLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            // A function call. Checks that the function returns a result.
            case BbLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case BbLexer.PLUS:
                    checkInteger(value);
                    break;
                case BbLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case BbLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case BbLexer.EQ:
            case BbLexer.NEQ:
            case BbLexer.LT:
            case BbLexer.LE:
            case BbLexer.GT:
            case BbLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case BbLexer.PLUS:
            case BbLexer.MINUS:
            case BbLexer.MUL:
            case BbLexer.DIV:
            case BbLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case BbLexer.AND:
            case BbLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, BbTree t) {
        // Boolean evaluation with short-circuit
        assert t != null;
        switch (type) {
            case BbLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case BbLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (BbTree AstF, BbTree args) {
        if (args != null) setLineNumber(args);
        BbTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            BbTree p = pars.getChild(i); // Parameters of the callee
            BbTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == BbLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != BbLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(BbTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        BbTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            BbTree p = params.getChild(i);
            if (p.getType() == BbLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(BbTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        BbTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            BbTree p = params.getChild(i);
            if (p.getType() == BbLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
    
    
    private void writeMIDI(){
    	//magic happens here
    	//if data is not music there is no output
    	//if data is music we call some class that converts it to MIDI
    	System.out.format("The result of the song is:\n");
    	for (int i = 0; i < music.size(); ++i){
    		assert music.get(i).isPlayable();
            System.out.println(music.get(i).toString());
    	}
    }
    
}
