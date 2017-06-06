grammar Bb;

options {
    output = AST;
    ASTLabelType = BbTree;
}

tokens {
    LIST_FUNCTIONS; // List of functions (the root of the tree)
    ASSIGN;     // Assignment instruction
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
    PACK;		
    CHORD;
    NOTEASSIGN;
    SPEED;
    NOTE;
    MELODY;
    PLAYABLE;
    POLIFONE;
    INST;
    INSTRUMENT;
    VOL;
}

@header {
package parser;
import interp.BbTree;
}

@lexer::header {
package parser;
}

// A program is a list of functions
prog    : func+ EOF -> ^(LIST_FUNCTIONS func+)
        ;

// A function has a name, a list of parameters and a block of instructions  
func    : FUNC^ ID params LB! block_instructions RB!
        ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   type^ ID
        |   notetype^ NOTEID
        ;
                
block_instructions
        :    instruction (';' instruction)*
            -> ^(LIST_INSTR instruction+)
        ;

        // The different types of instructions
instruction
        :   assign          // Assignment
        |   ite_stmt        // if-then-else
        |   while_stmt      // while statement
        |	for_stmt		//for statement
        |   funcall         // Call to a procedure (when no result is produced)
        |   return_stmt     // Return statement
        |   playable       // Play
        |	speed			//Defines the playing speed
        |	instrument		//Defines the default instrument
        |	volume			//Defines the default volume
        |	read            // Read a variable
        | 	write           // Write a string or an expression
        |                   // Nothing
        ;

// Assignment
assign  :   (type)? ID EQ expr -> ^(ASSIGN ID expr)
		|	NOTEID EQ musicnotation -> ^(NOTEASSIGN NOTEID musicnotation)
        ;

type	:   'int'
		|	'bool'
        |	'void'
        ;
        
notetype:   'Note' -> NOTE
        |   'Chord' -> CHORD
        |   'Melody' -> MELODY
        |   'Poli' -> POLIFONE
        ;
     
musicnotation	:	'Note' notabasica -> ^(NOTE notabasica)
				|	'Chord'! '('! chord ')'!
				|	melodia
				|	polifon
				|	NOTEID
				;


// if-then-else (else is optional)
ite_stmt    :   IF^ LP! expr RP! LB! block_instructions RB! (ELSE! LB! block_instructions RB!)?
            ;

// while statement
while_stmt  :   WHILE^ LP! expr RP! LB! block_instructions RB!
            ;
            
// for statement
for_stmt  :   FOR^ LP! assign ';'! expr ';'! assign RP! LB! block_instructions RB!
            ;

// Return statement with an expression
return_stmt :   RETURN^ all_expr?
        ;

//A playable is  something that can be turned into sound
playable: melodia
        | polifon
        | NOTEID -> ^(PLAYABLE NOTEID)
        | notelist
        ;
        

// Read a variable
read	:	READ^ ID
        ;

// Write an expression or a string
write	:   WRITE^ (expr | STRING )
        ;

instrument	: 'Instrument' INT -> ^(INSTRUMENT INT);
			
volume		: 'Vol' INT -> ^(VOL INT); //between 1 and 127

melodia: 'Melody' '(' INT notelist+ ')' -> ^(MELODY INT notelist+)
        ;

notelist: notas '.' duration MUL? -> ^(PLAYABLE notas duration MUL?);

notas: nota
     | '['! pack ']'!
     | '('! chord ')'!
     ;
     
nota: notabasica  -> ^(NOTE notabasica)
	| NOTEID ( '('! PLUS^ num_expr ')'!)?
	| QUIET -> ^(NOTE QUIET)
	;
	
	
chord: sub_chord -> ^(CHORD sub_chord)
	;
	
sub_chord: nota ( ','! (nota))*
	;
	
pack: sub_chord -> ^(PACK sub_chord)
	;
	

duration: INT 
    | '('! num_expr ')'!
    ;

polifon : 'Poli' LB voices+ RB -> ^(POLIFONE voices+)
        ;
        
voices:	melodia '|'!
	|	NOTEID  '|'!
		;

speed	:	'Speed' num_expr -> ^(SPEED num_expr);

// Grammar for expressions with boolean, relational and aritmetic operators
all_expr:  expr | musicnotation;
expr	:	boolterm (OR^ boolterm)*;

boolterm:   boolfact (AND^ boolfact)*
        ;

boolfact:   num_expr ((EQ^ | NEQ^ | LT^ | LE^ | GT^ | GE^) num_expr)?
        ;

num_expr:   term ( (PLUS^ | MINUS^) term)*
        ;

term    :   factor ( (MUL^ | DIV^ | MOD^ ) factor)*
        ;

factor  :   (NOT^ | PLUS^ | MINUS^)? atom
        ;

// Atom of the expressions (variables, integer and boolean literals).
// An atom can also be a function call or another expression
// in parenthesis
atom    :   ID
        |   INT
        |   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
        |	funcall
        |   '('! expr ')'!
        ;
// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A list of expressions separated by commas
expr_list:  all_expr (','! all_expr)*
        ;

notabasica : PITCH ALT? INT? ;
//Tokens
AND:    '&&' | 'and';
OR:     '||' | 'or';
NOT:    '!' | 'not';
VOICE: 'Voice';
FUNC: 'function';
LB  : '{';
RB  : '}';
LP  : '(';
RP  : ')';
EQ   : '=' ;
NEQ: '!=' ;
LT      : '<' ;
LE      : '<=';
GT      : '>';
GE      : '>=';
MUL : '*';
DIV : '/';
MOD : '%';
PLUS : '+';
MINUS : '-';
TRUE    : 'true' ;
FALSE   : 'false';
IF      : 'if' ;
THEN    : 'then' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
FOR		: 'for'	;
RETURN  : 'return';
READ	: 'read';
WRITE	: 'write';
PITCH	: ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B');
ALT		: ('#' | 'b');
QUIET	: 'Z';
ID  	:   ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9')* ;
NOTEID  :   ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')+;
INT :   '0'..'9'+ ;
// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;
// Strings (in quotes) with escape sequences        
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;
fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS      : ( ' '
        | '\t'
        | '\n'
        | '\r'
        ) {$channel=HIDDEN;}
        ;
