// Generated from be/unamur/info/b314/compiler/PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
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
	 * Visit a parse tree produced by {@link PlayPlusParser#mapDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDescription(PlayPlusParser.MapDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapSymbols(PlayPlusParser.MapSymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapImport(PlayPlusParser.MapImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(PlayPlusParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PlayPlusParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PlayPlusParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PlayPlusParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#functionInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariable(PlayPlusParser.GlobalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PlayPlusParser.VariableContext ctx);
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
	 * Visit a parse tree produced by {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PlayPlusParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#structureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureType(PlayPlusParser.StructureTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueInitialisation(PlayPlusParser.TrueInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseInitialisation(PlayPlusParser.FalseInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInitialisation(PlayPlusParser.NumberInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInitialisation(PlayPlusParser.StringInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharInitialisation(PlayPlusParser.CharInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx);
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
	 * Visit a parse tree produced by {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightExpr(PlayPlusParser.RightExprContext ctx);
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
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(PlayPlusParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(PlayPlusParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code up}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(PlayPlusParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code down}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(PlayPlusParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(PlayPlusParser.JumpContext ctx);
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
}