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
	 * Visit a parse tree produced by {@link LanguageParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(LanguageParser.RootContext ctx);
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
	 * Visit a parse tree produced by {@link LanguageParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LanguageParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariable(LanguageParser.GlobalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LanguageParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(LanguageParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(LanguageParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(LanguageParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVariable(LanguageParser.InitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#initArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitArray(LanguageParser.InitArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(LanguageParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(LanguageParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightExpr(LanguageParser.RightExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExpr(LanguageParser.LeftExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(LanguageParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionType(LanguageParser.ActionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#dig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(LanguageParser.DigContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#fight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFight(LanguageParser.FightContext ctx);
}