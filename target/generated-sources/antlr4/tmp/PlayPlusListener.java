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
	 * Enter a parse tree produced by the {@code mainProgram}
	 * labeled alternative in {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(PlayPlusParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainProgram}
	 * labeled alternative in {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(PlayPlusParser.MainProgramContext ctx);
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
	 * Enter a parse tree produced by the {@code mainFucntion}
	 * labeled alternative in {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFucntion(PlayPlusParser.MainFucntionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFucntion}
	 * labeled alternative in {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFucntion(PlayPlusParser.MainFucntionContext ctx);
}