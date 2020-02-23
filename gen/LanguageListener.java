// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/Language.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(LanguageParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(LanguageParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(LanguageParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(LanguageParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void enterMapImport(LanguageParser.MapImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void exitMapImport(LanguageParser.MapImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(LanguageParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(LanguageParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LanguageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariable(LanguageParser.GlobalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariable(LanguageParser.GlobalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LanguageParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LanguageParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(LanguageParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(LanguageParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(LanguageParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(LanguageParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(LanguageParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(LanguageParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterInitVariable(LanguageParser.InitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitInitVariable(LanguageParser.InitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#initArray}.
	 * @param ctx the parse tree
	 */
	void enterInitArray(LanguageParser.InitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#initArray}.
	 * @param ctx the parse tree
	 */
	void exitInitArray(LanguageParser.InitArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(LanguageParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(LanguageParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(LanguageParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(LanguageParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterRightExpr(LanguageParser.RightExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitRightExpr(LanguageParser.RightExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpr(LanguageParser.LeftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpr(LanguageParser.LeftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(LanguageParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(LanguageParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(LanguageParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(LanguageParser.ActionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#dig}.
	 * @param ctx the parse tree
	 */
	void enterDig(LanguageParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#dig}.
	 * @param ctx the parse tree
	 */
	void exitDig(LanguageParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#fight}.
	 * @param ctx the parse tree
	 */
	void enterFight(LanguageParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#fight}.
	 * @param ctx the parse tree
	 */
	void exitFight(LanguageParser.FightContext ctx);
}