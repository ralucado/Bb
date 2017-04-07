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
func    : (type | notetype) ID^ params LB! block_instructions RB!
        ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   type ID
        |   notetype NOTEID
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
        |   playable        // Play
        |	speed			//Defines the playing speed
        |                   // Nothing
        ;

// Assignment
assign  :   type ID eq=EQ n_expr -> ^(ASSIGN[$eq,":="] ID n_expr)
		|	notetype NOTEID EQ musicnotation -> ^(NOTEASSIGN NOTEID musicnotation)
        ;

type	:   'int'
        |	'void'
        ;
        
notetype:   'Note'
        |   'Chord'
        |   'Melody'
        |   'Poli'
        ;
     
musicnotation	:	'Note' notabasica ('.' num_expr MUL?)? -> ^(PLAYABLE ^(NOTE notabasica) (num_expr MUL?)?)
				|	'Chord'! '('! chord ')'!
				|	'Melody'! '('! melodia ')'!
				|	polifon
				|	NOTEID
				;


// if-then-else (else is optional)
ite_stmt    :   IF^ LP! n_expr RP! LB! block_instructions (ELSE! block_instructions)? RB!
            ;

// while statement
while_stmt  :   WHILE^ LP! n_expr RP! LB! block_instructions RB!
            ;
            
// for statement
for_stmt  :   FOR^ LP! assign ';' n_expr ';' assign RP! LB! block_instructions RB!
            ;

// Return statement with an expression
return_stmt :   RETURN^ (n_expr | musicnotation)?
        ;

//A playable is  something that can be turned into sound
playable: melodia
        | polifon
        | NOTEID
        ;

melodia: notelist+ -> ^(MELODY notelist+)
        ;

notelist: notas '.' duration MUL? -> ^(PLAYABLE notas duration MUL?);

notas: nota
     | '['! pack ']'!
     | '('! chord ')'!
     ;
     
nota: notabasica  -> ^(NOTE notabasica)
	| NOTEID ( '('! PLUS^ num_expr ')'!)?
	;
	
	
chord:	sub_chord -> ^(CHORD sub_chord)
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
        
voices:	VOICE! NOTEID^ melodia '|'!;

speed	:	'Speed' n_expr -> ^(SPEED n_expr);

// Grammar for expressions with boolean, relational and aritmetic operators
expr    : playable
		| n_expr
        ;

n_expr	:	boolterm (OR^ boolterm)*;

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
        |   '('! n_expr ')'!
        ;
// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A list of expressions separated by commas
expr_list:  expr (','! expr)*
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
