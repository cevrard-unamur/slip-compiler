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
}