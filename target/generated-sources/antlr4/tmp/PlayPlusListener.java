// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package tmp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(PlayPlusParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(PlayPlusParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapDescription}
	 * labeled alternative in {@link PlayPlusParser#mapStructure}.
	 * @param ctx the parse tree
	 */
	void enterMapDescription(PlayPlusParser.MapDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapDescription}
	 * labeled alternative in {@link PlayPlusParser#mapStructure}.
	 * @param ctx the parse tree
	 */
	void exitMapDescription(PlayPlusParser.MapDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code robot}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterRobot(PlayPlusParser.RobotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code robot}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitRobot(PlayPlusParser.RobotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chest}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterChest(PlayPlusParser.ChestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chest}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitChest(PlayPlusParser.ChestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grass}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterGrass(PlayPlusParser.GrassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grass}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitGrass(PlayPlusParser.GrassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code palmtree}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterPalmtree(PlayPlusParser.PalmtreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code palmtree}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitPalmtree(PlayPlusParser.PalmtreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bridge}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterBridge(PlayPlusParser.BridgeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bridge}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitBridge(PlayPlusParser.BridgeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bush}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterBush(PlayPlusParser.BushContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bush}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitBush(PlayPlusParser.BushContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cask}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCask(PlayPlusParser.CaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cask}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCask(PlayPlusParser.CaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code well}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterWell(PlayPlusParser.WellContext ctx);
	/**
	 * Exit a parse tree produced by the {@code well}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitWell(PlayPlusParser.WellContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(PlayPlusParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(PlayPlusParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code squeleton}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterSqueleton(PlayPlusParser.SqueletonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code squeleton}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitSqueleton(PlayPlusParser.SqueletonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentSingle}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCommentSingle(PlayPlusParser.CommentSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentSingle}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCommentSingle(PlayPlusParser.CommentSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentMulti}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCommentMulti(PlayPlusParser.CommentMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentMulti}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCommentMulti(PlayPlusParser.CommentMultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code programme}
	 * labeled alternative in {@link PlayPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programme}
	 * labeled alternative in {@link PlayPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void enterMapImportation(PlayPlusParser.MapImportationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void exitMapImportation(PlayPlusParser.MapImportationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code main}
	 * labeled alternative in {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMain(PlayPlusParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code main}
	 * labeled alternative in {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMain(PlayPlusParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link PlayPlusParser#funct}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PlayPlusParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link PlayPlusParser#funct}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PlayPlusParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionParameters}
	 * labeled alternative in {@link PlayPlusParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(PlayPlusParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionParameters}
	 * labeled alternative in {@link PlayPlusParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(PlayPlusParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link PlayPlusParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(PlayPlusParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link PlayPlusParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(PlayPlusParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link PlayPlusParser#functionInst}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link PlayPlusParser#functionInst}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalVariableDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(PlayPlusParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalVariableDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(PlayPlusParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalConstantDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalConstantDeclaration(PlayPlusParser.GlobalConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalConstantDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalConstantDeclaration(PlayPlusParser.GlobalConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalEnumDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalEnumDeclaration(PlayPlusParser.GlobalEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalEnumDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalEnumDeclaration(PlayPlusParser.GlobalEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalStructureDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStructureDeclaration(PlayPlusParser.GlobalStructureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalStructureDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStructureDeclaration(PlayPlusParser.GlobalStructureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PlayPlusParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PlayPlusParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structure}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structure}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDefinition}
	 * labeled alternative in {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinition(PlayPlusParser.ArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDefinition}
	 * labeled alternative in {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinition(PlayPlusParser.ArrayDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structureDefinition}
	 * labeled alternative in {@link PlayPlusParser#structureType}.
	 * @param ctx the parse tree
	 */
	void enterStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structureDefinition}
	 * labeled alternative in {@link PlayPlusParser#structureType}.
	 * @param ctx the parse tree
	 */
	void exitStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterTrueInitialisation(PlayPlusParser.TrueInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitTrueInitialisation(PlayPlusParser.TrueInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterFalseInitialisation(PlayPlusParser.FalseInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitFalseInitialisation(PlayPlusParser.FalseInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterNumberInitialisation(PlayPlusParser.NumberInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitNumberInitialisation(PlayPlusParser.NumberInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterStringInitialisation(PlayPlusParser.StringInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitStringInitialisation(PlayPlusParser.StringInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterCharInitialisation(PlayPlusParser.CharInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitCharInitialisation(PlayPlusParser.CharInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 */
	void enterInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 */
	void exitInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PlayPlusParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PlayPlusParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(PlayPlusParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(PlayPlusParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterString(PlayPlusParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitString(PlayPlusParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusNumbersExpression(PlayPlusParser.MinusNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusNumbersExpression(PlayPlusParser.MinusNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpression(PlayPlusParser.LeftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpression(PlayPlusParser.LeftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivideNumbersExpression(PlayPlusParser.DivideNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivideNumbersExpression(PlayPlusParser.DivideNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFalse(PlayPlusParser.BooleanFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFalse(PlayPlusParser.BooleanFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEqualExpression(PlayPlusParser.BooleanEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEqualExpression(PlayPlusParser.BooleanEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(PlayPlusParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(PlayPlusParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrExpression(PlayPlusParser.BooleanOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrExpression(PlayPlusParser.BooleanOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanGreatExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreatExpression(PlayPlusParser.BooleanGreatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanGreatExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreatExpression(PlayPlusParser.BooleanGreatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLessExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLessExpression(PlayPlusParser.BooleanLessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLessExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLessExpression(PlayPlusParser.BooleanLessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusNumberExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusNumberExpression(PlayPlusParser.MinusNumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusNumberExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusNumberExpression(PlayPlusParser.MinusNumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNotEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNotEqualExpression(PlayPlusParser.BooleanNotEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNotEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNotEqualExpression(PlayPlusParser.BooleanNotEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLessEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLessEqualExpression(PlayPlusParser.BooleanLessEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLessEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLessEqualExpression(PlayPlusParser.BooleanLessEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PlayPlusParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PlayPlusParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddNumbersExpression(PlayPlusParser.AddNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddNumbersExpression(PlayPlusParser.AddNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrue(PlayPlusParser.BooleanTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrue(PlayPlusParser.BooleanTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterChar(PlayPlusParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitChar(PlayPlusParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(PlayPlusParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(PlayPlusParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanGreatEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreatEqualExpression(PlayPlusParser.BooleanGreatEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanGreatEqualExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreatEqualExpression(PlayPlusParser.BooleanGreatEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterModNumbersExpression(PlayPlusParser.ModNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitModNumbersExpression(PlayPlusParser.ModNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyNumbersExpression(PlayPlusParser.MultiplyNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyNumbersExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyNumbersExpression(PlayPlusParser.MultiplyNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndExpression(PlayPlusParser.BooleanAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndExpression(PlayPlusParser.BooleanAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftProperty(PlayPlusParser.LeftPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftProperty(PlayPlusParser.LeftPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftId(PlayPlusParser.LeftIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftId(PlayPlusParser.LeftIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftArray(PlayPlusParser.LeftArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftArray(PlayPlusParser.LeftArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterLeft(PlayPlusParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitLeft(PlayPlusParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterRight(PlayPlusParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitRight(PlayPlusParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterUp(PlayPlusParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitUp(PlayPlusParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDown(PlayPlusParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDown(PlayPlusParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterJump(PlayPlusParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitJump(PlayPlusParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fightType}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterFightType(PlayPlusParser.FightTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fightType}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitFightType(PlayPlusParser.FightTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digType}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDigType(PlayPlusParser.DigTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digType}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDigType(PlayPlusParser.DigTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void enterDig(PlayPlusParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void exitDig(PlayPlusParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFight(PlayPlusParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFight(PlayPlusParser.FightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link PlayPlusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIf(PlayPlusParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link PlayPlusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIf(PlayPlusParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code then}
	 * labeled alternative in {@link PlayPlusParser#thenBlock}.
	 * @param ctx the parse tree
	 */
	void enterThen(PlayPlusParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code then}
	 * labeled alternative in {@link PlayPlusParser#thenBlock}.
	 * @param ctx the parse tree
	 */
	void exitThen(PlayPlusParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else}
	 * labeled alternative in {@link PlayPlusParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElse(PlayPlusParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else}
	 * labeled alternative in {@link PlayPlusParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElse(PlayPlusParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link PlayPlusParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhile(PlayPlusParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link PlayPlusParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhile(PlayPlusParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do}
	 * labeled alternative in {@link PlayPlusParser#doBlock}.
	 * @param ctx the parse tree
	 */
	void enterDo(PlayPlusParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do}
	 * labeled alternative in {@link PlayPlusParser#doBlock}.
	 * @param ctx the parse tree
	 */
	void exitDo(PlayPlusParser.DoContext ctx);
}