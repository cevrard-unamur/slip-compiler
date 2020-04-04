// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/Language.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programme}
	 * labeled alternative in {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(LanguageParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link LanguageParser#mapImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapImportation(LanguageParser.MapImportationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code main}
	 * labeled alternative in {@link LanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LanguageParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainInstruction}
	 * labeled alternative in {@link LanguageParser#mainFunctionInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainInstruction(LanguageParser.MainInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link LanguageParser#funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(LanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(LanguageParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParameters}
	 * labeled alternative in {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(LanguageParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link LanguageParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(LanguageParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInstruction(LanguageParser.VariableInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignationInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignationInstruction(LanguageParser.AssignationInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionInstruction(LanguageParser.ActionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstruction(LanguageParser.IfInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInstruction(LanguageParser.WhileInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatInstruction(LanguageParser.RepeatInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInstruction(LanguageParser.ForInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link LanguageParser#functionInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclaration(LanguageParser.GlobalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDefinition}
	 * labeled alternative in {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(LanguageParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(LanguageParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(LanguageParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structure}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(LanguageParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDefinition}
	 * labeled alternative in {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinition(LanguageParser.ArrayDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureDefinition}
	 * labeled alternative in {@link LanguageParser#structureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDefinition(LanguageParser.StructureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialisation(LanguageParser.ArrayInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightInitialisation(LanguageParser.RightInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#initArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitArray(LanguageParser.InitArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(LanguageParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(LanguageParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeIntegerExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeIntegerExpression(LanguageParser.NegativeIntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LanguageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(LanguageParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExpression(LanguageParser.LeftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(LanguageParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LanguageParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(LanguageParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(LanguageParser.CompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTrue(LanguageParser.BooleanTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(LanguageParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(LanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftProperty(LanguageParser.LeftPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftId(LanguageParser.LeftIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftPropertyArray}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftPropertyArray(LanguageParser.LeftPropertyArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArray(LanguageParser.LeftArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(LanguageParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code action}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(LanguageParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFight(LanguageParser.FightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(LanguageParser.DigContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#digInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigInstruction(LanguageParser.DigInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#fightInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFightInstruction(LanguageParser.FightInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LanguageParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LanguageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LanguageParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LanguageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link LanguageParser#repeatBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LanguageParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link LanguageParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LanguageParser.ForContext ctx);
}