lexer grammar PlayPlusWords;

// Words
// Map importation
IMPORT: '#import';
QUOTE: '"';
MAPFILE: ID'.map';

// Various
LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
SEMICOLON: ';';
RCRO: ']';
LCRO: '[';
AS: 'as';

// Functions
MAIN: 'main';
FUNCTION: 'function';
VOID: 'void';
DO: 'do';
END: 'end';

// Default actions
DIG: 'dig()';

// Types
SCALAR: 'boolean' | 'integer' | 'char';
RECORD: 'record';

// Identifiers
ID: LETTER (LETTER | DIGIT)* ;
NUMBER: (DIGIT)+;

// Fragments
fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT_MULTILINE: '/*' .*? '*/' -> skip;
COMMENT_SINGLELINE: '//' .*? NEWLINE -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;