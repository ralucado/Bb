grammar Bb;

options {
    output = AST;
    ASTLabelType = BbTree;
}

tokens {
    LIST_FUNCTIONS; // List of functions (the root of the tree)
    INTASSIGN;     // Assignment instruction
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
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
func    : FUNC^ ID LB! params block_instructions RB!
        ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   '&' id=ID -> ^(PREF[$id,$id.text])
        |   id=ID -> ^(PVALUE[$id,$id.text])
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
        |   funcall         // Call to a procedure (when no result is produced)
        |   return_stmt     // Return statement
        |   playable        // Play
        |                   // Nothing
        ;

// Assignment
assign  :   'int' ID eq=EQ expr -> ^(INTASSIGN[$eq,":="] ID expr)|   'Note' ID EQ 
        |   'Notes' ID EQ 
        |   'Playable' ID EQ 
        |   'Melody' ID EQ
        |   'Ensemble' ID EQ
        ;

// if-then-else (else is optional)
ite_stmt    :   IF^ LP! expr RP! LB! block_instructions (ELSE! block_instructions)? RB!
            ;

// while statement
while_stmt  :   WHILE^ expr LB! block_instructions RB!
            ;

// Return statement with an expression
return_stmt :   RETURN^ expr?
        ;

//A playable is  something that can be turned into sound
playable: melodia
        | polifon
        ;

melodia: (notas '.' duration ('*')?)+
        ;

notas: NOTA 
     | '(' NOTA (NOTA)* ')'
     ;

duration: INT 
    | '(' expr ')'
    ;

polifon : 'Poli' ID LB! ((VOICE ID)? (melodia '|'!))* RB!
        ;

// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
        ;

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
        |   funcall
        |   '('! expr ')'!
        |   polifon
        ;


// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A list of expressions separated by commas
expr_list:  expr (','! expr)*
        ;


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
RETURN  : 'return';
NOTA: ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B') ('0'..'9')? ('#' | 'b')? 
    |'Z'
    ;
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;
NEWLINE:'\r'? '\n' ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;
