grammar PlayPlus;

import PlayPlusWords;

root: programme;

programme:  mapImport ((COMMENT_MULTILINE)*|(COMMENT_SINGLELINE)*|(variableDeclaration)*)?  mainFunction
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO ((DIG SEMICOLON)|(instruction)+) END
            ;

instruction: (variableDeclaration|constDeclaration|enumDeclaration);

variableDeclaration: (ID (COMMA ID)* AS variableType (EQUAL initVariable)? SEMICOLON) | structure
            ;
variableType:  SCALAR | arrayType
            ;
arrayType: SCALAR LCRO NUMBER (COMMA NUMBER)* RCRO
            ;
structure: ID AS RECORD (variableDeclaration)+ END SEMICOLON
            ;
initVariable: TRUE|FALSE|NUMBER|STRING|CHAR|initArray
            ;
initArray: LPAR initVariable ((COMMA initVariable)*)? RPAR
            ;
constDeclaration: CONST ID AS (variableType|structure) EQUAL initVariable
            ;
enumDeclaration: ENUM ID EQUAL LPAR ID (COMMA ID)* RPAR SEMICOLON
            ;