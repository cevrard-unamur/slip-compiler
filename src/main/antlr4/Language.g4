grammar Language;

import LanguageWords;

programme:  mapImport (globalVariable)* (function)? mainFunction EOF
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO (instruction)* (digInstruction SEMICOLON) (instruction)* END
            ;

function: ID AS FUNCTION LPAR (argumentList)? RPAR COLON (SCALAR|VOID) DO (functionInstruction)+ END
            ;

argumentList: argument (COMMA argument)*
            ;

argument: (ID (COMMA ID)* AS variableType)
            ;

instruction: (variableDeclaration|assignation|(actionType SEMICOLON))
            ;
functionInstruction: ((enumDeclaration)*|(constDeclaration)*|(structureType)*)? (instruction)+
            ;
globalVariable: variableDeclaration
            | constDeclaration
            | enumDeclaration
            | structureType;

variableDeclaration: (ID (COMMA ID)* AS variableType (EQUAL initVariable)? SEMICOLON)       #variable
            ;
variableType: SCALAR                                                                        #scalar
            | arrayType                                                                     #array
            | structureType                                                                 #structure
            ;
arrayType: SCALAR LBRA NUMBER (COMMA NUMBER)* RBRA
            ;
structureType: ID AS RECORD (variableDeclaration)+ END SEMICOLON
            ;
initVariable: TRUE                                                                          #trueInitialisation
            | FALSE                                                                         #falseInitialisation
            | NUMBER                                                                        #numberInitialisation
            | STRING                                                                        #stringInitialisation
            | CHAR                                                                          #charInitialisation
            | initArray                                                                     #arrayInitialisation
            ;
initArray: LPAR initVariable ((COMMA initVariable)*)? RPAR
            ;
constDeclaration: CONST ID AS (variableType|structureType) EQUAL initVariable SEMICOLON     #constant
            ;
enumDeclaration: ENUM ID EQUAL LPAR ID (COMMA ID)* RPAR SEMICOLON                           #enumeration
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
leftExpr: ID                                                    #leftId
            | ID LBRA rightExpr (COMMA rightExpr)? RBRA         #leftArray
            | leftExpr.ID                                       #leftProperty
            ;
assignation: leftExpr ASSIGN (rightExpr)? SEMICOLON;
actionType: LEFT LPAR (rightExpr)? RPAR                         #left
            | RIGHT LPAR (rightExpr)? RPAR                      #right
            | UP LPAR (rightExpr)? RPAR                         #up
            | DOWN LPAR (rightExpr)? RPAR                       #down
            | JUMP LPAR (rightExpr)? RPAR                       #jump
            | fightInstruction                                  #fight
            | digInstruction                                    #dig
            ;
digInstruction: DIG LPAR RPAR
    ;
fightInstruction: FIGHT LPAR RPAR
    ;