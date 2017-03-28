 
grammar Music;

prog: ;




inst : '{' inst* '}'
     | ifstat ';'?
     | forstat ';'?
     | funcall ';'?
     | beat ';'?
     | speed ';'?
     | transport ';'?
     | sequence
     | ensemble
     ;
conds : cond*;
cond : (atom BOOLOP atom) ( ('and' | 'or') (atom BOOLOP atom))*;
ifstat : 'if' '(' conds ')' inst 'else' inst;
forstat : 'for' '(' assig ';' conds ';'  op ')' inst;
funcall : ID '(' list ')';
beat : 'Beat' atom ':' atom;
speed : 'Speed' DURATION ':' atom;
transport : 'Transport' atom;
voice : 'Voice' ID;
list : atom ( ',' atom)*;

atom: INT
    | ID ;

ensemble : ID '{' sequence '}' ; 
sequence : voice (('|' | repbar) bar ('|' | repbar))* ;
bar : (NOTE | inst) ( '|' (NOTE | inst))* ;
repbar : INT 'x' '||:' bar ':||' ;

NOTE : PITCH ('.' DURATION ('*')? )?;
DURATION : ('r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf');
PITCH : ('#' | 'b')? ('Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Quiet') ('0'..'9')?
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT : '0'..'9'+ ;
BOOLOP : ( '<' | '>' | '>=' | '<=' | '==');

WS  :   ('\r'? '\n' | ' '|'\t')+ {skip();} ;
