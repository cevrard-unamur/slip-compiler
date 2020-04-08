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
            | repeatBlock                                #repeatInstruction
            | forBlock                                  #forInstruction
            | (functionCall SEMICOLON)                  #functionCallInstruction
            ;
functionInst: ((enumDeclaration)*|(constDeclaration)*|(structureDeclaration)*)? (inst)+                        #functionInstruction
            ;
globalVariable: variableDeclaration                             #globalDeclaration
            | constDeclaration                                  #globalDeclaration
            | enumDeclaration                                   #globalDeclaration
            | structureDeclaration                                     #globalDeclaration
            ;

variableDeclaration: (ID (COMMA ID)* AS variableType (EQUAL initVariable)? SEMICOLON)       #variableDefinition
            ;
variableType: SCALAR                                                                        #scalarType
            | arrayDeclaration                                                              #arrayType
            | structureDeclaration                                                          #structureType
            ;
arrayDeclaration: SCALAR LBRA NUMBER (COMMA NUMBER)* RBRA                                          #array
            ;
structureDeclaration: ID AS RECORD (variableDeclaration|structureDeclaration)+ END SEMICOLON       #structure
            ;
initVariable: LPAR initVariable ((COMMA initVariable)*)? RPAR                               #arrayInitialisation
            | rightExpr                                                                     #rightInitialisation
            ;
constDeclaration: CONST ID AS (variableType|structureDeclaration) EQUAL initVariable SEMICOLON     #constant
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
            | functionCall                                          #functionCallExpression
            ;
functionCall: ID LPAR (rightExpr (COMMA rightExpr)*)? RPAR
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
