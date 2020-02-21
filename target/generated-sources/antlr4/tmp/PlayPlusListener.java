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
	 * Enter a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void enterMapImport(PlayPlusParser.MapImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void exitMapImport(PlayPlusParser.MapImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(PlayPlusParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(PlayPlusParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariable(PlayPlusParser.GlobalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariable(PlayPlusParser.GlobalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PlayPlusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PlayPlusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(PlayPlusParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(PlayPlusParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PlayPlusParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PlayPlusParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 */
	void enterInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 */
	void exitInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(PlayPlusParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(PlayPlusParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(PlayPlusParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(PlayPlusParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterRightExpr(PlayPlusParser.RightExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitRightExpr(PlayPlusParser.RightExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpr(PlayPlusParser.LeftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpr(PlayPlusParser.LeftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(PlayPlusParser.ActionTypeContext ctx);
}