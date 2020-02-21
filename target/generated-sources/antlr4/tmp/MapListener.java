// Generated from tmp/Map.g4 by ANTLR 4.6
package tmp;
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
}