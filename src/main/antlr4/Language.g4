grammar Language;

import LanguageWords;

prog:  mapImport (globalVariable)* (funct)? mainFunction EOF        #programme
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE                              #mapImportation
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO (inst)* (digInstruction SEMICOLON) (inst)* END   #main
            ;

funct: ID AS FUNCTION LPAR (argumentList)? RPAR COLON (SCALAR|VOID) DO (functionInst)+ END      #function
            ;

argumentList: argument (COMMA argument)*                                            #functionParameters
            ;

argument: (ID (COMMA ID)* AS variableType)                                          #functionParameter
            ;

inst:       (variableDeclaration|assignation|(actionType SEMICOLON))                #instruction
            ;
functionInst: ((enumDeclaration)*|(constDeclaration)*|(structureType)*)? (inst)+    #functionInstruction
            ;
globalVariable: variableDeclaration                             #globalVariableDeclaration
            | constDeclaration                                  #globalConstantDeclaration
            | enumDeclaration                                   #globalEnumDeclaration
            | structureType                                     #globalStructureDeclaration
            ;

variableDeclaration: (ID (COMMA ID)* AS variableType (EQUAL initVariable)? SEMICOLON)       #variable
            ;
variableType: SCALAR                                                                        #scalar
            | arrayType                                                                     #array
            | structureType                                                                 #structure
            ;
arrayType: SCALAR LBRA NUMBER (COMMA NUMBER)* RBRA                                          #arrayDefinition
            ;
structureType: ID AS RECORD (variableDeclaration)+ END SEMICOLON                            #structureDefinition
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
rightExpr: NOT<assoc=left> rightExpr                                #notExpression
            | rightExpr AND<assoc=left> rightExpr                   #booleanAndExpression
            | rightExpr OR<assoc=left> rightExpr                    #booleanOrExpression
            | rightExpr EQUAL<assoc=left> rightExpr                 #booleanEqualExpression
            | rightExpr LESS<assoc=left> rightExpr                  #booleanLessExpression
            | rightExpr LESS_EQUAL<assoc=left> rightExpr            #booleanLessEqualExpression
            | rightExpr GREAT<assoc=left> rightExpr                 #booleanGreatExpression
            | rightExpr GREAT_EQUAL<assoc=left> rightExpr           #booleanGreatEqualExpression
            | rightExpr NOT_EQUAL<assoc=left> rightExpr             #booleanNotEqualExpression
            | MINUS<assoc=left> rightExpr                           #minusNumberExpression
            | rightExpr PLUS<assoc=left> rightExpr                  #addNumbersExpression
            | rightExpr MINUS<assoc=left> rightExpr                 #minusNumbersExpression
            | rightExpr MULTI<assoc=left>rightExpr                  #multiplyNumbersExpression
            | rightExpr DIV<assoc=left> rightExpr                   #divideNumbersExpression
            | rightExpr MOD<assoc=left>rightExpr                    #modNumbersExpression
            | leftExpr                                              #leftExpression
            | NUMBER                                                #number
            | TRUE                                                  #booleanTrue
            | FALSE                                                 #booleanFalse
            | STRING                                                #string
            | CHAR                                                  #char
            | ID LPAR rightExpr ((COMMA rightExpr)*)? RPAR          #functionCallExpression
            | LPAR rightExpr RPAR                                   #parenthesesExpression
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
            | fightInstruction                                  #fightType
            | digInstruction                                    #digType
            ;
digInstruction: DIG LPAR RPAR                                   #dig
    ;
fightInstruction: FIGHT LPAR RPAR                               #fight
    ;