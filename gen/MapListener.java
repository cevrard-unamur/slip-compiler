// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/Map.g4 by ANTLR 4.8
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