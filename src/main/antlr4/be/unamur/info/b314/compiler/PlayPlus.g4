grammar PlayPlus;

import PlayPlusWords;

root: programme;

programme:  mapImport ((COMMENT_MULTILINE)*|(COMMENT_SINGLELINE)*|(variableDeclaration)*)?  mainFunction
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO ((DIG LPAR RPAR SEMICOLON)|(instruction)+) END
            ;

instruction: (variableDeclaration|constDeclaration|enumDeclaration|assignation|(actionType SEMICOLON));

variableDeclaration: (ID (COMMA ID)* AS variableType (EQUAL initVariable)? SEMICOLON) | structure
            ;
variableType:  SCALAR | arrayType
            ;
arrayType: SCALAR LBRA NUMBER (COMMA NUMBER)* RBRA
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
rightExpr: NOT<assoc=left> rightExpr
            | rightExpr AND<assoc=left> rightExpr
            | rightExpr OR<assoc=left> rightExpr
            | rightExpr EQUAL<assoc=left> rightExpr
            | rightExpr LESS<assoc=left> rightExpr
            | rightExpr LESS_EQUAL<assoc=left> rightExpr
            | rightExpr GREAT<assoc=left> rightExpr
            | rightExpr GREAT_EQUAL<assoc=left> rightExpr
            | rightExpr NOT_EQUAL<assoc=left> rightExpr
            | MINUS<assoc=left> rightExpr
            | rightExpr PLUS<assoc=left> rightExpr
            | rightExpr MINUS<assoc=left> rightExpr
            | rightExpr MULTI<assoc=left>rightExpr
            | rightExpr DIV<assoc=left> rightExpr
            | rightExpr MOD<assoc=left>rightExpr
            | leftExpr
            | NUMBER
            | TRUE
            | FALSE
            | STRING
            | CHAR
            | ID LPAR rightExpr ((COMMA rightExpr)*)? RPAR
            | LPAR rightExpr RPAR
            ;
leftExpr: ID
            | ID LBRA rightExpr (COMMA rightExpr)? RBRA
            | leftExpr.ID
            ;
assignation: leftExpr ASSIGN (rightExpr)? SEMICOLON;
actionType: LEFT LPAR (rightExpr)? RPAR
            | RIGHT LPAR (rightExpr)? RPAR
            | UP LPAR (rightExpr)? RPAR
            | DOWN LPAR (rightExpr)? RPAR
            | JUMP LPAR (rightExpr)? RPAR
            | FIGHT LPAR RPAR
            | DIG LPAR RPAR
            ;
