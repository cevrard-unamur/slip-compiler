// Generated from Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link LanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LanguageParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LanguageParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(LanguageParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(LanguageParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link LanguageParser#functionInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#functionInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
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
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LanguageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LanguageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterScalar(LanguageParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitScalar(LanguageParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterArray(LanguageParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitArray(LanguageParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structure}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterStructure(LanguageParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structure}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitStructure(LanguageParser.StructureContext ctx);
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
	 * Enter a parse tree produced by {@link LanguageParser#structureType}.
	 * @param ctx the parse tree
	 */
	void enterStructureType(LanguageParser.StructureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#structureType}.
	 * @param ctx the parse tree
	 */
	void exitStructureType(LanguageParser.StructureTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterTrueInitialisation(LanguageParser.TrueInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitTrueInitialisation(LanguageParser.TrueInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterFalseInitialisation(LanguageParser.FalseInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitFalseInitialisation(LanguageParser.FalseInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterNumberInitialisation(LanguageParser.NumberInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitNumberInitialisation(LanguageParser.NumberInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterStringInitialisation(LanguageParser.StringInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitStringInitialisation(LanguageParser.StringInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterCharInitialisation(LanguageParser.CharInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitCharInitialisation(LanguageParser.CharInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialisation(LanguageParser.ArrayInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialisation(LanguageParser.ArrayInitialisationContext ctx);
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
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LanguageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LanguageParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(LanguageParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(LanguageParser.EnumerationContext ctx);
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
	 * Enter a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftProperty(LanguageParser.LeftPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftProperty(LanguageParser.LeftPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftId(LanguageParser.LeftIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftId(LanguageParser.LeftIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftArray(LanguageParser.LeftArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftArray(LanguageParser.LeftArrayContext ctx);
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
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterLeft(LanguageParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitLeft(LanguageParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterRight(LanguageParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitRight(LanguageParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterUp(LanguageParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitUp(LanguageParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDown(LanguageParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDown(LanguageParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterJump(LanguageParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitJump(LanguageParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fight}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterFight(LanguageParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitFight(LanguageParser.FightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dig}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDig(LanguageParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDig(LanguageParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void enterDigInstruction(LanguageParser.DigInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void exitDigInstruction(LanguageParser.DigInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFightInstruction(LanguageParser.FightInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFightInstruction(LanguageParser.FightInstructionContext ctx);
}