lexer grammar PlayPlusWords;

// Words
// Map importation
IMPORT: '#import';
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
EQUAL: '=';
QUOTE: '"';
SINGLE_QUOTE: '\'';

// Functions
MAIN: 'main';
FUNCTION: 'function';
VOID: 'void';
DO: 'do';
END: 'end';
CONST: 'const';
ENUM: 'enum';

// Default actions
DIG: 'dig()';

// Types
SCALAR: 'boolean' | 'integer' | 'char';
RECORD: 'record';
TRUE: 'true';
FALSE: 'false';

// Identifiers
ID: LETTER (LETTER | DIGIT)* ;

STRING: '"'(LETTER|DIGIT)*'"';
CHAR: '\''(LETTER|DIGIT)'\'';
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