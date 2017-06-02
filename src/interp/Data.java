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

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;
import commons.*;
public class Data {
    /** Types of data */
    public enum Type {VOID, INT, BOOL, NOTE, CHORD, MELODY, POLIFONY;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value;
	private Note n;
	private Chord c;
	private Melody m;
	private Polifony p;
    
    
    /** Constructor for integers */
    Data(int v) { type = Type.INT; value = v;}

    /** Constructor for Booleans */
    Data(boolean b) { type = Type.BOOL; value = b ? 1 : 0;}

    /**Constructors for music data*/
    Data (Note a){setValue(a);}
    Data (Chord a){setValue(a);}
    Data (Melody a){setValue(a);}
    Data (Polifony a){setValue(a);}
    
    /** Constructor for void data */
    Data() {type = Type.VOID; }
    
    
    /** Copy constructor */
    Data(Data a) { type = a.type; value = a.value;  n = a.n; c = a.c; m = a.m; p = a.p;}

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOL; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INT; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }
    /** Indicates whether the data is music */
	public boolean isNote(){return type == Type.NOTE;}
	public boolean isChord(){return type == Type.CHORD;}
	public boolean isMelody(){return type == Type.MELODY;}
	public boolean isPolifony(){return type == Type.POLIFONY;}
    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INT;
        return value;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOL;
        return value == 1;
    }
    
	//value getters
	public Note getNoteValue(){return n;}
	public Chord getChordValue(){return c;}
	public Melody getMelodyValue(){return m;}
	public Polifony getPolifonyValue(){return p;}
	
	public Sound getSound() {
		assert (isChord() || isNote());
		if(isChord()){
			return new Chord(c);
		} 
		else return new Note(n);
	}
    

    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { type = Type.BOOL; value = b ? 1 : 0; }

    /** Defines value for the data */
    public void setValue(int v) { type = Type.INT; value = v;}
	public void setValue(Note a){ type = Type.NOTE; nullValues(); n = new Note(a);}
	public void setValue(Chord a){  type = Type.CHORD; nullValues(); c = new Chord(a); }
	public void setValue(Melody a){  type = Type.MELODY; nullValues(); m = new Melody(a);}
	public void setValue(Polifony a){ type = Type.POLIFONY; nullValues(); p = new Polifony(a);}
	
	/** Defines duration for the data. Must be chord or note*/
	public void setDuration(double duration) {
		assert(type == Type.NOTE || type == Type.CHORD);
		if(type == Type.CHORD) c.setDuration(duration);
		else n.setDuration(duration);
	}
	
	//avoid storing unnecessary data
	private void nullValues() {
		n = null;
		c = null;
		m = null;
		p = null;
	}

    /** Copies the value from another data */
    public void setData(Data a) {type = a.type; value = a.value;  n = a.n; c = a.c; m = a.m; p = a.p;}
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
    	switch(type){
    		case BOOL:
    			return value == 1 ? "true" : "false";
    		case INT:
    			 return  Integer.toString(value);
    		case NOTE:
    			return n.toString();
    		case CHORD:
    			return c.toString();
    		case MELODY:
    			return m.toString();
    		case POLIFONY:
    			return p.toString();
    		default:
    			return null;
    			
    	}

    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value == 0) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
     
    public void evaluateArithmetic (int op, Data d) {
        assert (type == Type.INT && d.type == Type.INT);
        switch (op) {
            case BbLexer.PLUS: value += d.value; break;
            case BbLexer.MINUS: value -= d.value; break;
            case BbLexer.MUL: value *= d.value; break;
            case BbLexer.DIV: checkDivZero(d); value /= d.value; break;
            case BbLexer.MOD: checkDivZero(d); value %= d.value; break;
            default: assert false;
        }
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type == d.type;
        switch (op) {
            case BbLexer.EQ: return new Data(value == d.value);
            case BbLexer.NEQ: return new Data(value != d.value);
            case BbLexer.LT: return new Data(value < d.value);
            case BbLexer.LE: return new Data(value <= d.value);
            case BbLexer.GT: return new Data(value > d.value);
            case BbLexer.GE: return new Data(value >= d.value);
            default: assert false; 
        }
        return null;
    }

	public void raisePitch(int i) {
		switch(type){
			case NOTE:
				n = new Note(n);
				n.raisePitch(i);
				break;
			case CHORD:
				c = new Chord(c);
				c.raisePitch(i);
				break;
			case MELODY:
				m = new Melody(m);
				m.raisePitch(i);
				break;
			case POLIFONY:
				p = new Polifony(p);
				p.raisePitch(i);
				break;
			default:
				break;
		}
	}

	public boolean isPlayable() {
		switch(type){
			case NOTE:
					return n != null && n.hasDuration();
			case CHORD:
					return c != null && c.hasDuration();
			case MELODY:
					return m != null;
			case POLIFONY:
					return p != null;
			default:
				break;
		}
		return false;
	}

	public void setInstrument(int instrument) {
		assert(type == Type.NOTE || type == Type.CHORD);
		if(type == Type.CHORD) c.setInstrument(instrument);
		else n.setInstrument(instrument);
	}

	public void setVolume(int vol) {	
		assert(type == Type.NOTE || type == Type.CHORD);
		if(type == Type.CHORD) c.setVolume(vol);
		else n.setVolume(vol);
	}
	
}
