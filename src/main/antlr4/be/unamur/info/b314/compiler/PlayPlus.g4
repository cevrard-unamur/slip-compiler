grammar PlayPlus;

import PlayPlusWords;

root: programme;

programme:  mapImport ((COMMENT_MULTILINE)*|(COMMENT_SINGLELINE)*|(variableDeclaration)*)?  mainFunction
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO ((DIG SEMICOLON)|(instruction)+) END
            ;

instruction: (variableDeclaration);

variableDeclaration: (ID (COMMA ID)* AS variableType SEMICOLON) | structure
            ;
variableType:  SCALAR | arrayType
            ;
arrayType: SCALAR LCRO NUMBER (COMMA NUMBER)* RCRO
            ;
structure: ID AS RECORD (variableDeclaration)+ END SEMICOLON
            ;