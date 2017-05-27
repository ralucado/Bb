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

package Bb;

// Imports for ANTLR
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
// Imports from Java
import org.apache.commons.cli.*; // Command Language Interface
import java.io.*;

// Parser and Interpreter
import parser.*;
import interp.*;

/**
 * The class <code>Bb</code> implement the main function of the
 * interpreter. It accepts a set of options to generate the AST in
 * dot format and avoid the execution of the program. To know about
 * the accepted options, run the command Bb -help.
 */

public class Bb{

    /** The file name of the program. */
    private static String infile = null;
    /** Name of the file representing the AST. */
    private static String astfile = null;
    /** Flag indicating that the AST must be written in dot format. */
    private static boolean dotformat = false;
    /** Name of the file storing the trace of the program. */
    private static String tracefile = null;
    /** Flag to indicate whether the program must be executed after parsing. */
    private static boolean execute = true;
      
    /** Main program that invokes the parser and the interpreter. */
    
    public static void main(String[] args) throws Exception {
        // Parser for command line options
        if (!readOptions (args)) System.exit(1);

        // Parsing of the input file
        
        CharStream input = null;
        try {
            input = new ANTLRFileStream(infile);
        } catch (IOException e) {
            System.err.println ("Error: file " + infile + " could not be opened.");
            System.exit(1);
        }

        // Creates the lexer
        BbLexer lex = new BbLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Creates and runs the parser. As a result, an AST is created
        BbParser parser = new BbParser(tokens);
        BbTreeAdaptor adaptor = new BbTreeAdaptor();
        parser.setTreeAdaptor(adaptor);
        BbParser.prog_return result = null;
        try {
            result = parser.prog();
        } catch (Exception e) {} // Just catch the exception (nothing to do)
        
        // Check for parsing errors
        int nerrors = parser.getNumberOfSyntaxErrors();
        if (nerrors > 0) {
            System.err.println (nerrors + " errors detected. " +
                                "The program has not been executed.");
            System.exit(1);
        }

        // Get the AST
        BbTree t = (BbTree)result.getTree();

        // Generate a file for the AST (option -ast file)
        if (astfile != null) {
            File ast = new File(astfile);
            BufferedWriter output = new BufferedWriter(new FileWriter(ast));
            if (dotformat) {
                DOTTreeGenerator gen = new DOTTreeGenerator();
                output.write(gen.toDOT(t).toString());
            } else {
                output.write(t.toStringTree());
            }
            output.close();
        }

        // Start interpretation (only if execution required)
        if (execute) {
            // Creates and prepares the interpreter
            Interp I = null;
            int linenumber = -1;
            try {
                I = new Interp(t, tracefile); // prepares the interpreter
                I.Run();                  // Executes the code
            } catch (RuntimeException e) {
                if (I != null) linenumber = I.lineNumber();
                System.err.print ("Runtime error");
                if (linenumber < 0) System.err.print (": ");
                else System.err.print (" (" + infile + ", line " + linenumber + "): ");
                System.err.println (e.getMessage() + ".");
                System.err.format (I.getStackTrace());
            } catch (StackOverflowError e) {
                if (I != null) linenumber = I.lineNumber();
                System.err.print("Stack overflow error");
                if (linenumber < 0) System.err.print (".");
                else System.err.println (" (" + infile + ", line " + linenumber + ").");
                System.err.format (I.getStackTrace(5));
            }
        }
    }

    /**
     * Function to parse the command line. It defines some of
     * the attributes of the class. It returns true if the parsing
     * hass been successful, and false otherwise.
     */

    private static boolean readOptions(String[] args) {
        // Define the options
        Option help = new Option("help", "print this message");
        Option noexec = new Option("noexec", "do not execute the program");
        Option dot = new Option("dot", "dump the AST in dot format");
        OptionBuilder
                        .withArgName ("file");
		OptionBuilder
                        .hasArg();
		OptionBuilder
                        .withDescription ("write the AST");
		Option ast = OptionBuilder
                        .create ("ast");
        OptionBuilder
                        .withArgName ("file");
		OptionBuilder
                        .hasArg();
		OptionBuilder
                        .withDescription ("write a trace of function calls during the execution of the program");
		Option trace = OptionBuilder
                        .create ("trace");
                                       
        Options options = new Options();
        options.addOption(help);
        options.addOption(dot);
        options.addOption(ast);
        options.addOption(trace);
        options.addOption(noexec);
        CommandLineParser clp = new GnuParser();
        CommandLine line = null;

        String cmdline = "Bb [options] file";
        
        
        // Parse the options
        try {
            line = clp.parse (options, args);
        }
        catch (ParseException exp) {
            System.err.println ("Incorrect command line: " + exp.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }

        // Option -help
        if (line.hasOption ("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }
        
        // Option -dot
        if (line.hasOption ("dot")) dotformat = true;

        // Option -ast dotfile
        if (line.hasOption ("ast")) astfile = line.getOptionValue ("ast");
        
        // Option -trace dotfile
        if (line.hasOption ("trace")) tracefile = line.getOptionValue ("trace");
        
        // Option -noexec
        if (line.hasOption ("noexec")) execute = false;

        // Remaining arguments (the input file)
        String[] files = line.getArgs();
        if (files.length != 1) {
            System.err.println ("Incorrect command line.");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }
        
        infile = files[0];
        return true;
    }
}

