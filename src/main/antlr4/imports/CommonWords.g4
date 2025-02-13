lexer grammar CommonWords;

COLON: ':';

NUMBER: (DIGIT)+;

// Fragments
fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;
COMMENT_SINGLELINE: '//' .*? (NEWLINE|EOF) EOF? -> skip;

// Whitespaces -> ignored
NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;