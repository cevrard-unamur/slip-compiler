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
	 * Visit a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PlayPlusParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(PlayPlusParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PlayPlusParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(PlayPlusParser.StructureContext ctx);
}