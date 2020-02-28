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
	 * Visit a parse tree produced by {@link LanguageParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(LanguageParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#mapImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapImport(LanguageParser.MapImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(LanguageParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(LanguageParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LanguageParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LanguageParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#functionInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariable(LanguageParser.GlobalVariableContext ctx);
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
	 * Visit a parse tree produced by {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(LanguageParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#structureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureType(LanguageParser.StructureTypeContext ctx);
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
	 * Visit a parse tree produced by {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightExpr(LanguageParser.RightExprContext ctx);
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
}