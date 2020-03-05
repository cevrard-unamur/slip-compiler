// Generated from Language.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link LanguageParser#funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LanguageParser.FunctionContext ctx);
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
	 * Visit a parse tree produced by the {@code instruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LanguageParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link LanguageParser#functionInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalVariableDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariableDeclaration(LanguageParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalConstantDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalConstantDeclaration(LanguageParser.GlobalConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalEnumDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalEnumDeclaration(LanguageParser.GlobalEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalStructureDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStructureDeclaration(LanguageParser.GlobalStructureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LanguageParser.VariableContext ctx);
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
	 * Visit a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueInitialisation(LanguageParser.TrueInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseInitialisation(LanguageParser.FalseInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInitialisation(LanguageParser.NumberInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInitialisation(LanguageParser.StringInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharInitialisation(LanguageParser.CharInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialisation(LanguageParser.ArrayInitialisationContext ctx);
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
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LanguageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusNumbersExpression(LanguageParser.MinusNumbersExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExpression(LanguageParser.LeftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideNumbersExpression(LanguageParser.DivideNumbersExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanEqualExpression(LanguageParser.BooleanEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrExpression(LanguageParser.BooleanOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanGreatExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreatExpression(LanguageParser.BooleanGreatExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLessExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLessExpression(LanguageParser.BooleanLessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusNumberExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusNumberExpression(LanguageParser.MinusNumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanNotEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNotEqualExpression(LanguageParser.BooleanNotEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLessEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLessEqualExpression(LanguageParser.BooleanLessEqualExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code addNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddNumbersExpression(LanguageParser.AddNumbersExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code booleanGreatEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreatEqualExpression(LanguageParser.BooleanGreatEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModNumbersExpression(LanguageParser.ModNumbersExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyNumbersExpression(LanguageParser.MultiplyNumbersExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndExpression(LanguageParser.BooleanAndExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(LanguageParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(LanguageParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code up}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(LanguageParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code down}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(LanguageParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(LanguageParser.JumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fightType}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFightType(LanguageParser.FightTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digType}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigType(LanguageParser.DigTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link LanguageParser#digInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(LanguageParser.DigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link LanguageParser#fightInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFight(LanguageParser.FightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LanguageParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LanguageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code then}
	 * labeled alternative in {@link LanguageParser#thenBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen(LanguageParser.ThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else}
	 * labeled alternative in {@link LanguageParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(LanguageParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LanguageParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LanguageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do}
	 * labeled alternative in {@link LanguageParser#doBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(LanguageParser.DoContext ctx);
}