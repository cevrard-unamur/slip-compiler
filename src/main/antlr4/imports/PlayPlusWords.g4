lexer grammar PlayPlusWords;

// Words
// Map importation
IMPORT: '#import';
QUOTE: '"';
MAPFILE: ID + '.map';

// Functions
MAIN: 'main';
AS: 'as';
FUNCTION: 'function';
LPAR: '(';
RPAR: ')';
COLON: ':';
VOID: 'void';
DO: 'do';
END: 'end';

// Identifiers
ID: LETTER (LETTER | DIGIT)* ;
NUMBER: (DIGIT)+;

// Fragments
fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;