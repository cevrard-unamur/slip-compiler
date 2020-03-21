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
	 * Visit a parse tree produced by the {@code mapDescription}
	 * labeled alternative in {@link MapParser#mapStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDescription(MapParser.MapDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code robot}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobot(MapParser.RobotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chest}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChest(MapParser.ChestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grass}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrass(MapParser.GrassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code palmtree}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalmtree(MapParser.PalmtreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bridge}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBridge(MapParser.BridgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bush}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBush(MapParser.BushContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cask}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCask(MapParser.CaskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code well}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWell(MapParser.WellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(MapParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code squeleton}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqueleton(MapParser.SqueletonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentSingle}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSingle(MapParser.CommentSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentMulti}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentMulti(MapParser.CommentMultiContext ctx);
}