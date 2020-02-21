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
RBRA: ']';
LBRA: '[';
AS: 'as';
EQUAL: '=';
QUOTE: '"';
SINGLE_QUOTE: '\'';
ASSIGN: ':=';

// Functions
MAIN: 'main';
FUNCTION: 'function';
VOID: 'void';
DO: 'do';
END: 'end';
CONST: 'const';
ENUM: 'enum';

// Mathematical signs
PLUS: '+';
MINUS: '-';
MULTI: '*';
DIV: '/';
MOD: '%';

// Boolean signs
TRUE: 'true';
FALSE: 'false';
AND: 'and';
OR: 'or';
NOT: 'not';
LESS: '<';
LESS_EQUAL: '<=';
GREAT: '>';
GREAT_EQUAL: '>=';
NOT_EQUAL: '<>';

// Default actions
LEFT: 'left';
RIGHT: 'right';
UP: 'up';
DOWN: 'down';
JUMP: 'jump';
FIGHT: 'fight';
DIG: 'dig';

// Types
SCALAR: 'boolean' | 'integer' | 'char';
RECORD: 'record';

// Identifiers
ID: LETTER (LETTER | DIGIT)* ;

STRING: '"'(LETTER|DIGIT|[ \t]|(('\r')?'\n'))*'"';
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