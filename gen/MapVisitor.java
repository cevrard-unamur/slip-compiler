// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/Map.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MapParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(MapParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapParser#mapDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDescription(MapParser.MapDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapSymbols(MapParser.MapSymbolsContext ctx);
}