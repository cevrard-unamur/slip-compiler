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
	 * Enter a parse tree produced by the {@code mainInstruction}
	 * labeled alternative in {@link PlayPlusParser#mainFunctionInstruction}.
	 * @param ctx the parse tree
	 */
	void enterMainInstruction(PlayPlusParser.MainInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainInstruction}
	 * labeled alternative in {@link PlayPlusParser#mainFunctionInstruction}.
	 * @param ctx the parse tree
	 */
	void exitMainInstruction(PlayPlusParser.MainInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link PlayPlusParser#funct}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link PlayPlusParser#funct}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx);
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
	 * Enter a parse tree produced by the {@code variableInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterVariableInstruction(PlayPlusParser.VariableInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitVariableInstruction(PlayPlusParser.VariableInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignationInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignationInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterActionInstruction(PlayPlusParser.ActionInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitActionInstruction(PlayPlusParser.ActionInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterIfInstruction(PlayPlusParser.IfInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitIfInstruction(PlayPlusParser.IfInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterWhileInstruction(PlayPlusParser.WhileInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitWhileInstruction(PlayPlusParser.WhileInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterForInstruction(PlayPlusParser.ForInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitForInstruction(PlayPlusParser.ForInstructionContext ctx);
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
	 * Enter a parse tree produced by the {@code globalDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDefinition}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDefinition}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx);
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
	 * Enter a parse tree produced by the {@code rightInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterRightInitialisation(PlayPlusParser.RightInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitRightInitialisation(PlayPlusParser.RightInitialisationContext ctx);
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
	 * Enter a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpression(PlayPlusParser.CompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpression(PlayPlusParser.CompExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(PlayPlusParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(PlayPlusParser.BoolExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code action}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterAction(PlayPlusParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code action}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitAction(PlayPlusParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterFight(PlayPlusParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitFight(PlayPlusParser.FightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDig(PlayPlusParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDig(PlayPlusParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void enterDigInstruction(PlayPlusParser.DigInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void exitDigInstruction(PlayPlusParser.DigInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFightInstruction(PlayPlusParser.FightInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFightInstruction(PlayPlusParser.FightInstructionContext ctx);
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
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link PlayPlusParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(PlayPlusParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link PlayPlusParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(PlayPlusParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link PlayPlusParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterFor(PlayPlusParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link PlayPlusParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitFor(PlayPlusParser.ForContext ctx);
}