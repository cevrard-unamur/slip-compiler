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
	 * Enter a parse tree produced by the {@code mapDescription}
	 * labeled alternative in {@link MapParser#mapStructure}.
	 * @param ctx the parse tree
	 */
	void enterMapDescription(MapParser.MapDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapDescription}
	 * labeled alternative in {@link MapParser#mapStructure}.
	 * @param ctx the parse tree
	 */
	void exitMapDescription(MapParser.MapDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code robot}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterRobot(MapParser.RobotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code robot}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitRobot(MapParser.RobotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chest}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterChest(MapParser.ChestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chest}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitChest(MapParser.ChestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grass}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterGrass(MapParser.GrassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grass}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitGrass(MapParser.GrassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code palmtree}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterPalmtree(MapParser.PalmtreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code palmtree}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitPalmtree(MapParser.PalmtreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bridge}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterBridge(MapParser.BridgeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bridge}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitBridge(MapParser.BridgeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bush}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterBush(MapParser.BushContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bush}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitBush(MapParser.BushContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cask}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCask(MapParser.CaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cask}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCask(MapParser.CaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code well}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterWell(MapParser.WellContext ctx);
	/**
	 * Exit a parse tree produced by the {@code well}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitWell(MapParser.WellContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(MapParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(MapParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code squeleton}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterSqueleton(MapParser.SqueletonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code squeleton}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitSqueleton(MapParser.SqueletonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentSingle}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCommentSingle(MapParser.CommentSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentSingle}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCommentSingle(MapParser.CommentSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentMulti}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCommentMulti(MapParser.CommentMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentMulti}
	 * labeled alternative in {@link MapParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCommentMulti(MapParser.CommentMultiContext ctx);
}