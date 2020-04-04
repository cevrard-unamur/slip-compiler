// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package tmp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(PlayPlusParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapDescription}
	 * labeled alternative in {@link PlayPlusParser#mapStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDescription(PlayPlusParser.MapDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code robot}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobot(PlayPlusParser.RobotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chest}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChest(PlayPlusParser.ChestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grass}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrass(PlayPlusParser.GrassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code palmtree}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalmtree(PlayPlusParser.PalmtreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bridge}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBridge(PlayPlusParser.BridgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bush}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBush(PlayPlusParser.BushContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cask}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCask(PlayPlusParser.CaskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code well}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWell(PlayPlusParser.WellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(PlayPlusParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code squeleton}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqueleton(PlayPlusParser.SqueletonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentSingle}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSingle(PlayPlusParser.CommentSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentMulti}
	 * labeled alternative in {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentMulti(PlayPlusParser.CommentMultiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programme}
	 * labeled alternative in {@link PlayPlusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapImportation(PlayPlusParser.MapImportationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code main}
	 * labeled alternative in {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PlayPlusParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainInstruction}
	 * labeled alternative in {@link PlayPlusParser#mainFunctionInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainInstruction(PlayPlusParser.MainInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link PlayPlusParser#funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParameters}
	 * labeled alternative in {@link PlayPlusParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(PlayPlusParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link PlayPlusParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(PlayPlusParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInstruction(PlayPlusParser.VariableInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignationInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionInstruction(PlayPlusParser.ActionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstruction(PlayPlusParser.IfInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInstruction(PlayPlusParser.WhileInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInstruction}
	 * labeled alternative in {@link PlayPlusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInstruction(PlayPlusParser.ForInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link PlayPlusParser#functionInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalDeclaration}
	 * labeled alternative in {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDefinition}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structure}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDefinition}
	 * labeled alternative in {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinition(PlayPlusParser.ArrayDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureDefinition}
	 * labeled alternative in {@link PlayPlusParser#structureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightInitialisation(PlayPlusParser.RightInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PlayPlusParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(PlayPlusParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeIntegerExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeIntegerExpression(PlayPlusParser.NegativeIntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PlayPlusParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(PlayPlusParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExpression(PlayPlusParser.LeftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalse(PlayPlusParser.BooleanFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(PlayPlusParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PlayPlusParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(PlayPlusParser.CompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTrue(PlayPlusParser.BooleanTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(PlayPlusParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(PlayPlusParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftProperty(PlayPlusParser.LeftPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftId(PlayPlusParser.LeftIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArray(PlayPlusParser.LeftArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code action}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PlayPlusParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFight(PlayPlusParser.FightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(PlayPlusParser.DigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigInstruction(PlayPlusParser.DigInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFightInstruction(PlayPlusParser.FightInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link PlayPlusParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(PlayPlusParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link PlayPlusParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PlayPlusParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link PlayPlusParser#repeatBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(PlayPlusParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link PlayPlusParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(PlayPlusParser.ForContext ctx);
}