package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.*;
import be.unamur.info.b314.compiler.exception.BooleanRightExpressionException;
import be.unamur.info.b314.compiler.exception.IncorrectTypeException;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.helper.ArrayHelper;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class LanguageVisitor extends PlayPlusBaseVisitor {
    private Application application;

    public LanguageVisitor(Application application) {
        this.application = application;
    }

    @Override
    public Object visitGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx) {
        try {
            Object declaration = ctx.children.get(0);

            if (declaration instanceof PlayPlusParser.VariableDefinitionContext) {
                parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)declaration);
            } else if (declaration instanceof PlayPlusParser.StructureDeclarationContext) {
                parseStructureDeclaration((PlayPlusParser.StructureDeclarationContext)declaration);
            } else if (declaration instanceof PlayPlusParser.EnumDeclarationContext) {
                parseEnumeration((PlayPlusParser.EnumerationContext)declaration);
            } else if (declaration instanceof PlayPlusParser.ConstantContext) {
                parseConstant((PlayPlusParser.ConstantContext)declaration);
            } else {
                throw new PlayPlusException("This global declaration is not managed");
            }

            return super.visitGlobalDeclaration(ctx);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    @Override
    public Object visitFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx) {
        try {
            return parseFunctionDefinition(ctx);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    @Override
    public Object visitMain(PlayPlusParser.MainContext ctx) {
        try {
            PlayPlusParser.MainInstructionContext instructions = (PlayPlusParser.MainInstructionContext)ctx.mainFunctionInstruction();

            parseMainInstructionContext(instructions);

            return super.visitMain(ctx);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    // Parse a boolean expression
    private Object parseBooleanRightExpression(PlayPlusParser.RightExprContext ctx) {
        if (ctx instanceof PlayPlusParser.BooleanTrueContext || ctx instanceof PlayPlusParser.BooleanFalseContext) {
            return ctx;
        } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            return parseBooleanLeftExpression((PlayPlusParser.LeftExpressionContext) ctx);
        } else if (ctx instanceof PlayPlusParser.ParenthesesExpressionContext) {
            return parseBooleanParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.CompExpressionContext) {
            return parseCompExpression((PlayPlusParser.CompExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.BoolExpressionContext) {
            return parseBooleanExpression((PlayPlusParser.BoolExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.NotExpressionContext) {
            return parseNotExpression((PlayPlusParser.NotExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return parseFunctionCall((PlayPlusParser.FunctionCallExpressionContext)ctx, "boolean");
        } else {
            throw new BooleanRightExpressionException("Cannot parse this as a boolean expression");
        }
    }

    private Object parseBooleanExpression(PlayPlusParser.BoolExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = ctx.rightExpr(1);

        parseBooleanRightExpression(leftChild);
        parseBooleanRightExpression(rightChild);

        return ctx;
    }

    private Object parseBooleanLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        return parseLeftExpression(ctx, "boolean");
    }

    private Object parseBooleanParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseBooleanRightExpression(ctx.rightExpr());
    }

    private Object parseNotExpression(PlayPlusParser.NotExpressionContext ctx) {
        return parseBooleanRightExpression(ctx.rightExpr());
    }

    // Parse a integer expression
    private Object parseIntegerRightExpression(PlayPlusParser.RightExprContext ctx) {
        if (ctx instanceof PlayPlusParser.NumberContext) {
            return ctx;
        } else if (ctx instanceof PlayPlusParser.IntegerExpressionContext) {
            return parseIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.ParenthesesExpressionContext) {
            return parseIntegerParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            return parseIntegerLeftExpression((PlayPlusParser.LeftExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.CompExpressionContext) {
            return parseCompExpression((PlayPlusParser.CompExpressionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.NegativeIntegerExpressionContext) {
            return parseIntegerRightExpression(((PlayPlusParser.NegativeIntegerExpressionContext) ctx).rightExpr());
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return parseFunctionCall((PlayPlusParser.FunctionCallExpressionContext)ctx, "integer");
        } else {
            throw new IntegerRightExpressionException("Cannot parse this as an integer expression");
        }
    }

    private Object parseIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.rightExpr(1);

        parseIntegerRightExpression(leftChild);
        parseIntegerRightExpression(rightChild);

        return ctx;
    }

    private Object parseIntegerParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseIntegerRightExpression(ctx.rightExpr());
    }

    private Object parseIntegerLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        return parseLeftExpression(ctx, "integer");
    }

    // Parse char expression
    private Object parseCharRightExpression(PlayPlusParser.RightExprContext ctx) {
        if (ctx instanceof PlayPlusParser.CharContext) {
            return parseCharExpression((PlayPlusParser.CharContext)ctx);
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return parseFunctionCall((PlayPlusParser.FunctionCallExpressionContext)ctx, "char");
        } else {
            throw new IntegerRightExpressionException("Cannot parse this as a char expression");
        }
    }

    private Object parseCharExpression(PlayPlusParser.CharContext ctx) {
        return ctx;
    }

    // Parse enum expression
    private Object parseEnumerationDeclaration(PlayPlusParser.EnumDeclarationContext ctx) {
        parseEnumeration((PlayPlusParser.EnumerationContext)ctx);

        return ctx;
    }

    private Object parseEnumeration(PlayPlusParser.EnumerationContext ctx) {
        List<String> values = new ArrayList<>();

        for (int i = 1; i < ctx.ID().size(); i++) {
            values.add(ctx.ID(i).getText());
        }

        this.application.addEnum(ctx.ID(0).getText(), values);

        return ctx;
    }

    // Parse structure expression
    private Object parseStructureDeclaration(PlayPlusParser.StructureDeclarationContext ctx) {
        parseStructure((PlayPlusParser.StructureContext)ctx);

        return ctx;
    }

    private Object parseStructure(PlayPlusParser.StructureContext ctx) {
        this.application.addRecord(ctx.ID().getText());

        for (ParseTree node : ctx.children) {
            if (node instanceof PlayPlusParser.VariableDefinitionContext) {
                parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)node);
            } else if (node instanceof PlayPlusParser.StructureDeclarationContext) {
                parseStructureDeclaration((PlayPlusParser.StructureDeclarationContext)node);
            }
        }

        this.application.leaveContext();

        return  ctx;
    }

    // Parse generic expression
    private Object parseLeftExpression(PlayPlusParser.LeftExpressionContext ctx, String expectedType) {
        PlayPlusParser.LeftExprContext leftContext = ctx.leftExpr();

        if (leftContext instanceof PlayPlusParser.LeftIdContext) {
            Variable variable = this.application.getVariable(leftContext.getText());

            if (!variable.getType().equals(expectedType)) {
                throw new IncorrectTypeException("The type of the variable " + variable.getName() + " is incorrect - ID Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftArrayContext) {
            Array array = this.application.getArray(((PlayPlusParser.LeftArrayContext) leftContext).ID().getText());


            if (!array.getType().equals(expectedType)) {
                throw new IncorrectTypeException("The type of the variable " + array.getName() + " is incorrect - Array Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftPropertyContext) {
        }

        return ctx;
    }

    private Object parseCompExpression(PlayPlusParser.CompExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = ctx.rightExpr(1);

        String hasIntegerError = "";
        String hasBooleanError = "";
        String hasCharError = "";

        try {
            parseIntegerRightExpression(leftChild);
            parseIntegerRightExpression(rightChild);
        } catch (Exception ex) {
            hasIntegerError = ex.getMessage();
        }

        if (hasIntegerError != "") {
            try {
                parseBooleanRightExpression(leftChild);
                parseBooleanRightExpression(rightChild);
            } catch (Exception ex) {
                hasBooleanError = ex.getMessage();
            }

            if (hasBooleanError != "") {
                try {
                    parseCharRightExpression(leftChild);
                    parseCharRightExpression(rightChild);
                } catch (Exception ex) {
                    hasCharError = ex.getMessage();
                }
            }
        }

        if (hasCharError != "") {
            throw new PlayPlusException("Cannot compare those types - " + hasIntegerError + " - " + hasBooleanError + " - " + hasCharError);
        }

        return ctx;
    }

    private Object parseParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx, String expectedType) {
        if (ctx.rightExpr() instanceof PlayPlusParser.ParenthesesExpressionContext) {
            parseParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx.rightExpr(), expectedType);
        } else {
            if (ctx.rightExpr() instanceof PlayPlusParser.BoolExpressionContext && expectedType.equals("boolean")) {
                parseBooleanExpression((PlayPlusParser.BoolExpressionContext)ctx.rightExpr());
            } else if (ctx.rightExpr() instanceof PlayPlusParser.IntegerExpressionContext && expectedType.equals("integer")) {
                parseIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx.rightExpr());
            } else if (ctx.rightExpr() instanceof PlayPlusParser.CompExpressionContext && expectedType.equals("boolean")) {
                parseIntegerRightExpression(ctx.rightExpr());
            } else if (ctx.rightExpr() instanceof PlayPlusParser.NotExpressionContext && expectedType.equals("boolean")) {
                parseNotExpression((PlayPlusParser.NotExpressionContext)ctx.rightExpr());
            } else {
                throw new PlayPlusException("This parentheses construction is not known");
            }
        }

        return ctx;
    }

    // Parse action
    private Object parseActionInstruction(PlayPlusParser.ActionInstructionContext ctx) {
        PlayPlusParser.ActionTypeContext action = ctx.actionType();

        if (action instanceof PlayPlusParser.DigContext ||
            action instanceof PlayPlusParser.FightContext) {
            return ctx;
        }

        parseAction((PlayPlusParser.ActionContext)action);

        return ctx;
    }

    private Object parseAction(PlayPlusParser.ActionContext ctx) {
        if (ctx.children.size() == 3) {
            return ctx;
        }

        return parseIntegerRightExpression(ctx.rightExpr());
    }

    // Parse constant
    private Object parseConstantDeclaration(PlayPlusParser.ConstDeclarationContext ctx) {
        parseConstant((PlayPlusParser.ConstantContext)ctx);

        return ctx;
    }

    private Object parseConstant(PlayPlusParser.ConstantContext ctx) {
        if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext)
        {
            addVariable((PlayPlusParser.ScalarTypeContext)ctx.variableType(), ctx.ID(), true);
        }
        else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext)
        {
            addArray((PlayPlusParser.ArrayTypeContext)ctx.variableType(), ctx.ID());

        } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
            addStructure(ctx.ID());
        }

        return ctx;
    }

    // Parse if
    private Object parseIfInstruction(PlayPlusParser.IfInstructionContext ctx) {
        return parseIf((PlayPlusParser.IfContext)ctx.ifBlock());
    }

    private Object parseIf(PlayPlusParser.IfContext ctx) {
        parseBooleanRightExpression(ctx.rightExpr());

        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            parseInstruction(instruction);
        }

        return ctx;
    }

    // Parse while
    private Object parseWhileInstruction(PlayPlusParser.WhileInstructionContext ctx) {
        return parseWhile((PlayPlusParser.WhileContext)ctx.whileBlock());
    }

    private Object parseWhile(PlayPlusParser.WhileContext ctx) {
        parseBooleanRightExpression(ctx.rightExpr());

        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            parseInstruction(instruction);
        }

        return ctx;
    }

    // Parse for
    private Object parseForInstruction(PlayPlusParser.ForInstructionContext ctx) {
        return parseFor((PlayPlusParser.ForContext)ctx.forBlock());
    }

    private Object parseFor(PlayPlusParser.ForContext ctx) {
        // We check if the variable exist


        // We check if the right expression are both integer
        parseIntegerRightExpression(ctx.rightExpr(0));
        parseBooleanRightExpression(ctx.rightExpr(1));

        // We check if the instruction are correct
        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            parseInstruction(instruction);
        }

        return  ctx;
    }

    // Parse repeat
    private Object parseRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx) {
        return parseRepeat((PlayPlusParser.RepeatContext)ctx.repeatBlock());
    }

    private Object parseRepeat(PlayPlusParser.RepeatContext ctx) {
        parseBooleanRightExpression(ctx.rightExpr());

        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            parseInstruction(instruction);
        }

        return ctx;
    }

    // Parse function
    private Object parseFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx) {
        this.application.addFunction(ctx.ID().getText(), ctx.returnType().getText());

        // TODO Parameters

        if (ctx.functionInst().size() > 0) {
            parseFunctionInstruction((PlayPlusParser.FunctionInstructionContext)ctx.functionInst().get(0));
        }

        this.application.leaveContext();

        return ctx;
    }

    private Object parseFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx) {
        // Handle enumeration declaration
        for (PlayPlusParser.EnumDeclarationContext enumeration : ctx.enumDeclaration()) {
            parseEnumerationDeclaration(enumeration);
        }

        // Handle constant declaration
        for (PlayPlusParser.ConstDeclarationContext constant : ctx.constDeclaration()) {
            parseConstantDeclaration(constant);
        }

        // Handle structure declaration
        for (PlayPlusParser.StructureDeclarationContext structure : ctx.structureDeclaration()) {
            parseStructureDeclaration(structure);
        }

        // Handle instruction
        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            parseInstruction(instruction);
        }

        return ctx;
    }

    private Object parseFunctionCall(PlayPlusParser.FunctionCallExpressionContext ctx, String expectedType) {
        // Check if the return type of the function is matching
        Function function = this.application.getFunction(ctx.ID().getText());

        if (!function.getReturnType().equals(expectedType)) {
            throw new PlayPlusException("The function type is not matching the expected one - " + expectedType);
        }

        // Check if the parameters are matching

        return ctx;
    }

    // Parse variable
    private Object parseVariableInstruction(PlayPlusParser.VariableInstructionContext ctx) {
        parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)ctx.variableDeclaration());
        return ctx;
    }

    private Object parseVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext) {
                addVariable((PlayPlusParser.ScalarTypeContext)ctx.variableType(), id, false);
            } else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext) {
                addArray((PlayPlusParser.ArrayTypeContext)ctx.variableType(), id);
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
                addStructure(id);
            }
        }

        return ctx;
    }

    // Parse declaration
    private Object parseAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx) {
        return parseAssignation(ctx.assignation());
    }

    private Object parseAssignation(PlayPlusParser.AssignationContext ctx) {
        // We check the validity of both expression
        PlayPlusParser.LeftExprContext leftExpression = ctx.leftExpr();
        PlayPlusParser.RightExprContext rightExpression = ctx.rightExpr();

        VariableBase leftVariable = null;

        if (leftExpression instanceof PlayPlusParser.LeftIdContext) {
            TerminalNode id = ((PlayPlusParser.LeftIdContext) leftExpression).ID();
            leftVariable = this.application.getVariable(id.getText());
        } else if (leftExpression instanceof PlayPlusParser.LeftArrayContext) {
            TerminalNode id = ((PlayPlusParser.LeftArrayContext) leftExpression).ID();
            leftVariable = this.application.getArray(id.getText());
        } else if (leftExpression instanceof PlayPlusParser.LeftPropertyArrayContext) {
            PlayPlusParser.LeftExprContext recordExpression = ((PlayPlusParser.LeftPropertyArrayContext) leftExpression).leftExpr();
            TerminalNode arrayId = ((PlayPlusParser.LeftPropertyArrayContext) leftExpression).ID();
            leftVariable = this.application.getArrayOfRecord(recordExpression.getText(), arrayId.getText());
        }else if (leftExpression instanceof PlayPlusParser.LeftPropertyContext) {
            PlayPlusParser.LeftExprContext recordExpression = ((PlayPlusParser.LeftPropertyContext) leftExpression).leftExpr();
            TerminalNode arrayId = ((PlayPlusParser.LeftPropertyContext) leftExpression).ID();
            leftVariable = this.application.getVariableOfRecord(recordExpression.getText(), arrayId.getText());
        } else {
            throw new PlayPlusException("This left expression as an assignation is not known");
        }

        if (leftVariable instanceof Variable && ((Variable) leftVariable).getConstant()) {
            throw new PlayPlusException("Cannot assign a constant variable");
        }

        if (rightExpression instanceof PlayPlusParser.NumberContext ||
                rightExpression instanceof PlayPlusParser.IntegerExpressionContext) {
            if (!leftVariable.getType().equals("integer")) {
                throw new PlayPlusException("The left and right type are not both integer");
            }

            parseIntegerRightExpression(rightExpression);
        } else if (rightExpression instanceof PlayPlusParser.NegativeIntegerExpressionContext) {
            parseIntegerRightExpression(((PlayPlusParser.NegativeIntegerExpressionContext) rightExpression).rightExpr());
        } else if (rightExpression instanceof PlayPlusParser.CompExpressionContext) {
            if (!leftVariable.getType().equals("boolean")) {
                throw new PlayPlusException("The left type is not a boolean but we compare the value");
            }

            parseIntegerRightExpression(rightExpression);
        } else if (rightExpression instanceof PlayPlusParser.BoolExpressionContext ||
                rightExpression instanceof PlayPlusParser.BooleanFalseContext ||
                rightExpression instanceof PlayPlusParser.BooleanTrueContext ||
                rightExpression instanceof PlayPlusParser.NotExpressionContext) {
            if (!leftVariable.getType().equals("boolean")) {
                throw new PlayPlusException("The left and right type are not both boolean");
            }

            parseBooleanRightExpression(rightExpression);
        } else if (rightExpression instanceof PlayPlusParser.FunctionCallExpressionContext) {
            // TODO
        } else if (rightExpression instanceof PlayPlusParser.ParenthesesExpressionContext) {
            parseParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)rightExpression, leftVariable.getType());
        } else if (rightExpression instanceof PlayPlusParser.CharContext) {
            if (!leftVariable.getType().equals("char")) {
                throw new PlayPlusException("The left and right type are not both char");
            }
        } else if (rightExpression instanceof PlayPlusParser.LeftExpressionContext) {
            parseLeftExpression((PlayPlusParser.LeftExpressionContext)rightExpression, leftVariable.getType());
        } else {
            throw new PlayPlusException("This right expression as an assignation is not known");
        }

        return ctx;
    }

    private Object parseInstruction(PlayPlusParser.InstContext ctx) {
        if (ctx instanceof PlayPlusParser.ActionInstructionContext) {
            parseActionInstruction((PlayPlusParser.ActionInstructionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.AssignationInstructionContext) {
            parseAssignationInstruction((PlayPlusParser.AssignationInstructionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.VariableInstructionContext) {
            parseVariableInstruction((PlayPlusParser.VariableInstructionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.IfInstructionContext) {
            parseIfInstruction((PlayPlusParser.IfInstructionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.WhileInstructionContext) {
            parseWhileInstruction((PlayPlusParser.WhileInstructionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.RepeatInstructionContext) {
            parseRepeatInstruction((PlayPlusParser.RepeatInstructionContext)ctx);
        } else if (ctx instanceof PlayPlusParser.ForInstructionContext) {
            parseForInstruction((PlayPlusParser.ForInstructionContext)ctx);
        }
        return ctx;
    }

    private Object parseMainInstructionContext(PlayPlusParser.MainInstructionContext ctx) {
        for (Object node : ctx.children) {
            if (node instanceof PlayPlusParser.ActionInstructionContext) {
                parseActionInstruction((PlayPlusParser.ActionInstructionContext)node);
            } else if (node instanceof PlayPlusParser.AssignationInstructionContext) {
                parseAssignationInstruction((PlayPlusParser.AssignationInstructionContext)node);
            } else if (node instanceof PlayPlusParser.IfInstructionContext) {
                parseIfInstruction((PlayPlusParser.IfInstructionContext)node);
            } else if (node instanceof PlayPlusParser.WhileInstructionContext) {
                parseWhileInstruction((PlayPlusParser.WhileInstructionContext)node);
            } else if (node instanceof PlayPlusParser.ForInstructionContext) {
                parseForInstruction((PlayPlusParser.ForInstructionContext)node);
            } else if (node instanceof PlayPlusParser.RepeatInstructionContext) {
                parseRepeatInstruction((PlayPlusParser.RepeatInstructionContext)node);
            } else if (node instanceof PlayPlusParser.DigInstructionContext) {
            } else if (node instanceof TerminalNode) {
            } else {
                throw new PlayPlusException("Not manage");
            }
        }

        return ctx;
    }

    private void addVariable(PlayPlusParser.ScalarTypeContext ctx, TerminalNode id, boolean isConstant) {
        TerminalNode variableType = ctx.SCALAR();

        this.application.addVariable(variableType.getText(), id.getText(), isConstant);
    }

    private void addArray(PlayPlusParser.ArrayTypeContext ctx, TerminalNode id) {
        PlayPlusParser.ArrayContext arrayType = (PlayPlusParser.ArrayContext)ctx.children.get(0);

        this.application.addArray(arrayType.SCALAR().getText(), id.getText(), ArrayHelper.getSize(arrayType));
    }

    private void addStructure(TerminalNode id) {
        this.application.addRecord(id.getText());
    }
}
