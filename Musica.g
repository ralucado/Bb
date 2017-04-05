grammar Musica;

prog:   stat+ ;
                
stat:   expr NEWLINE
    |   ID '=' expr NEWLINE
    |   NEWLINE
    ;

expr:   multExpr ('+' multExpr | '-' multExpr)*
    ;

multExpr:   numatom ('*' numatom)*
    ; 

numatom:   INT
    |   ID
    ;

atom: numatom
    | polifon
    ;

insts: (inst | '{' insts* '}' |);

inst: for
    | while
    | funcall
    | assig
    ;

assig: 'int'? ID EQ 
    | 'Note' ID EQ 
    | 'Notes' ID EQ 
    | 'Playable' ID EQ 
    | 'Melody' ID EQ
    | 'Ensemble' ID EQ
    ;

cond: bool (( and | or ) bool)+;

bool: 

funcall: ID '(' arglist ')';

arglist: (atom (',' atom)*)?;

for: 'for' '(' assig? ';' cond? ';' assig? ')' insts;

while: 'while' '(' bool ')' insts;

notas: NOTA 
    | '(' NOTA (',' NOTA)* ')'
    ;

playable: notas ('.' duration ('*')? )?
    ;

duration: INT 
    | '(' expr ')'
    ;

melodia: (playable)*;

polifon: '{' ((VOICE ID)? melodia '|')* '}'
    |  (VOICE ID)? melodia ';'?;

NOTA: ('Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B') ('0'..'9')? 
    |'Quiet'
    ;
VOICE: 'Voice';
EQ: '=';
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
