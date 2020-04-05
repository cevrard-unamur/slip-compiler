grammar Language;

import LanguageWords;

prog:  mapImport (globalVariable|funct)* mainFunction EOF                                               #programme
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE                                                                  #mapImportation
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO mainFunctionInstruction END                      #main
            ;

mainFunctionInstruction: ((inst)* (digInstruction SEMICOLON) (inst)*)                                   #mainInstruction
            ;

funct: ID AS FUNCTION LPAR (argumentList)? RPAR COLON returnType DO (functionInst)+ END                 #functionDefinition
            ;

returnType: SCALAR|VOID                                                                                 #returnType
            ;

argumentList: argument (COMMA argument)*                                                                #functionParameters
            ;

argument: (ID (COMMA ID)* AS variableType)                                                              #functionParameter
            ;

inst:       variableDeclaration                         #variableInstruction
            | assignation                               #assignationInstruction
            | (actionType SEMICOLON)                    #actionInstruction
            | ifBlock                                   #ifInstruction
            | whileBlock                                #whileInstruction
            | repeatBlock                               #repeatInstruction
            | forBlock                                  #forInstruction
            ;
functionInst: ((enumDeclaration)*|(constDeclaration)*|(structureType)*)? (inst)+                        #functionInstruction
            ;
globalVariable: variableDeclaration                             #globalDeclaration
            | constDeclaration                                  #globalDeclaration
            | enumDeclaration                                   #globalDeclaration
            | structureType                                     #globalDeclaration
            ;

variableDeclaration: (ID (COMMA ID)* AS variableType (EQUAL initVariable)? SEMICOLON)       #variableDefinition
            ;
variableType: SCALAR                                                                        #scalar
            | arrayType                                                                     #array
            | structureType                                                                 #structure
            ;
arrayType: SCALAR LBRA NUMBER (COMMA NUMBER)* RBRA                                          #arrayDefinition
            ;
structureType: ID AS RECORD (variableDeclaration|structureType)+ END SEMICOLON              #structureDefinition
            ;
initVariable: initArray                                                                     #arrayInitialisation
            | rightExpr                                                                     #rightInitialisation
            ;
initArray: LPAR initVariable ((COMMA initVariable)*)? RPAR
            ;
constDeclaration: CONST ID AS (variableType|structureType) EQUAL initVariable SEMICOLON     #constant
            ;
enumDeclaration: ENUM ID EQUAL LPAR ID (COMMA ID)* RPAR SEMICOLON                           #enumeration
            ;
rightExpr: LPAR rightExpr RPAR                                      #parenthesesExpression
            | rightExpr MULTI<assoc=left>rightExpr                  #integerExpression
            | rightExpr DIV<assoc=left> rightExpr                   #integerExpression
            | rightExpr MOD<assoc=left>rightExpr                    #integerExpression
            | rightExpr PLUS<assoc=left> rightExpr                  #integerExpression
            | rightExpr MINUS<assoc=left> rightExpr                 #integerExpression
            | MINUS<assoc=left> rightExpr                           #negativeIntegerExpression
            | rightExpr EQUAL<assoc=left> rightExpr                 #compExpression
            | rightExpr LESS<assoc=left> rightExpr                  #compExpression
            | rightExpr LESS_EQUAL<assoc=left> rightExpr            #compExpression
            | rightExpr GREAT<assoc=left> rightExpr                 #compExpression
            | rightExpr GREAT_EQUAL<assoc=left> rightExpr           #compExpression
            | rightExpr NOT_EQUAL<assoc=left> rightExpr             #compExpression
            | rightExpr AND<assoc=left> rightExpr                   #boolExpression
            | rightExpr OR<assoc=left> rightExpr                    #boolExpression
            | NOT<assoc=left> rightExpr                             #notExpression
            | leftExpr                                              #leftExpression
            | NUMBER                                                #number
            | TRUE                                                  #booleanTrue
            | FALSE                                                 #booleanFalse
            | STRING                                                #string
            | CHAR                                                  #char
            | ID LPAR (rightExpr (COMMA rightExpr)*)? RPAR          #functionCallExpression
            ;
leftExpr: ID                                                            #leftId
            | ID LBRA rightExpr (COMMA rightExpr)? RBRA                 #leftArray
            | leftExpr'.'ID                                             #leftProperty
            | leftExpr'.'ID LBRA rightExpr (COMMA rightExpr)? RBRA      #leftPropertyArray
            ;
assignation: leftExpr ASSIGN rightExpr SEMICOLON
            ;
actionType: LEFT LPAR (rightExpr)? RPAR                             #action
            | RIGHT LPAR (rightExpr)? RPAR                          #action
            | UP LPAR (rightExpr)? RPAR                             #action
            | DOWN LPAR (rightExpr)? RPAR                           #action
            | JUMP LPAR (rightExpr)? RPAR                           #action
            | fightInstruction                                      #fight
            | digInstruction                                        #dig
            ;
digInstruction: DIG LPAR RPAR
            ;
fightInstruction: FIGHT LPAR RPAR
            ;
ifBlock: IF LPAR rightExpr RPAR THEN (inst)+ (ELSE (inst)+)? END    #if
            ;
whileBlock: WHILE LPAR rightExpr RPAR DO (inst)+ END                #while
            ;
repeatBlock: REPEAT (inst)+ UNTIL LPAR rightExpr RPAR END           #repeat
            ;
forBlock: FOR ID ASSIGN rightExpr TO rightExpr DO (inst)+ END       #for
            ;
