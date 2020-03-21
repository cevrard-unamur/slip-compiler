lexer grammar LanguageWords;

import CommonWords;

// Words
// Map importation
IMPORT: '#'(WS)*'import';
MAPFILE: ID'.map';

// Various
LPAR: '(';
RPAR: ')';
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

// Loop and condition
IF: 'if';
WHILE: 'while';
TO: 'to';
UNTIL: 'until';
THEN: 'then';
ELSE: 'else';
REPEAT: 'repeat';
FOR: 'for';

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