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
	 * Visit a parse tree produced by the {@code mainProgram}
	 * labeled alternative in {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(PlayPlusParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapImportation(PlayPlusParser.MapImportationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainFucntion}
	 * labeled alternative in {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFucntion(PlayPlusParser.MainFucntionContext ctx);
}