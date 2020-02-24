// Generated from Map.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MapParser}.
 */
public interface MapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MapParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(MapParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(MapParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapParser#mapDescription}.
	 * @param ctx the parse tree
	 */
	void enterMapDescription(MapParser.MapDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapParser#mapDescription}.
	 * @param ctx the parse tree
	 */
	void exitMapDescription(MapParser.MapDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterMapSymbols(MapParser.MapSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitMapSymbols(MapParser.MapSymbolsContext ctx);
}