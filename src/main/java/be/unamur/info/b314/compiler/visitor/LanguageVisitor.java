package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.exception.BooleanRightExpressionException;
import be.unamur.info.b314.compiler.exception.IncorrectTypeException;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.helper.ArrayHelper;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LanguageVisitor extends PlayPlusBaseVisitor {
    private Application application;

    public LanguageVisitor(Application application) {
        this.application = application;
    }

    @Override
    public Object visitGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx) {
        Object declaration = ctx.children.get(0);

        if (declaration instanceof PlayPlusParser.VariableDefinitionContext) {
            parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)declaration);
        } else if (declaration instanceof PlayPlusParser.StructureDefinitionContext) {
            parseStructureDefinition((PlayPlusParser.StructureDefinitionContext)declaration);
        } else if (declaration instanceof PlayPlusParser.EnumDeclarationContext) {
            // TODO
        } else if (declaration instanceof PlayPlusParser.ConstDeclarationContext) {
            // TODO
        } else if (declaration instanceof PlayPlusParser.FunctionDefinitionContext) {
            parseFunctionDefinition((PlayPlusParser.FunctionDefinitionContext)declaration);
        } else {
            throw new PlayPlusException("This global declaration is not managed");
        }

        return super.visitGlobalDeclaration(ctx);
    }

    @Override
    public Object visitMain(PlayPlusParser.MainContext ctx) {
        PlayPlusParser.MainInstructionContext instructions = (PlayPlusParser.MainInstructionContext)ctx.children.get(8);

        parseMainInstructionContext(instructions);

        return super.visitMain(ctx);
    }

    // Parse a boolean expression
    private Object parseBooleanRightExpression(PlayPlusParser.RightExprContext ctx) {
        try {
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
            } else {
                throw new BooleanRightExpressionException("Cannot parse this as a boolean expression");
            }
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private Object parseBooleanExpression(PlayPlusParser.BoolExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
        PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

        parseBooleanRightExpression(leftChild);
        parseBooleanRightExpression(rightChild);

        return ctx;
    }

    private Object parseBooleanLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        return parseLeftExpression(ctx, "boolean");
    }

    private Object parseBooleanParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseBooleanRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(1));
    }

    private Object parseNotExpression(PlayPlusParser.NotExpressionContext ctx) {
        return parseBooleanRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(1));
    }

    // Parse a integer expression
    private Object parseIntegerRightExpression(PlayPlusParser.RightExprContext ctx) {
        try {
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
            } else {
                throw new IntegerRightExpressionException("Cannot parse this as an integer expression");
            }
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private Object parseIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
        PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

        parseIntegerRightExpression(leftChild);
        parseIntegerRightExpression(rightChild);

        return ctx;
    }

    private Object parseIntegerParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseIntegerRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(1));
    }

    private Object parseIntegerLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        return parseLeftExpression(ctx, "integer");
    }

    // Parse generic expression
    private Object parseLeftExpression(PlayPlusParser.LeftExpressionContext ctx, String type) {
        PlayPlusParser.LeftExprContext leftContext = (PlayPlusParser.LeftExprContext)ctx.children.get(0);

        if (leftContext instanceof PlayPlusParser.LeftIdContext) {
            Variable variable = this.application.getVariable(leftContext.getText());

            if (!variable.getType().equals(type)) {
                throw new IncorrectTypeException("The type of the variable " + variable.getName() + " is incorrect - ID Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftArrayContext) {
            Array array = this.application.getArray(((PlayPlusParser.LeftArrayContext) leftContext).ID().getText());


            if (!array.getType().equals(type)) {
                throw new IncorrectTypeException("The type of the variable " + array.getName() + " is incorrect - Array Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftPropertyContext) {
        }

        return ctx;
    }

    private Object parseCompExpression(PlayPlusParser.CompExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
        PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

        parseIntegerRightExpression(leftChild).toString();
        parseIntegerRightExpression(rightChild).toString();

        return ctx;
    }

    private Object parseParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        if (ctx.children.get(0) instanceof PlayPlusParser.ParenthesesExpressionContext) {
            parseParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx.children.get(0));
        } else {
            if (ctx.children.get(1) instanceof PlayPlusParser.BoolExpressionContext) {
                parseBooleanExpression((PlayPlusParser.BoolExpressionContext)ctx.children.get(1));
            } else if (ctx.children.get(1) instanceof PlayPlusParser.IntegerExpressionContext) {
                parseIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx.children.get(1));
            } else if (ctx.children.get(1) instanceof PlayPlusParser.CompExpressionContext) {
                parseIntegerRightExpression((PlayPlusParser.CompExpressionContext)ctx.children.get(1));
            } else {
                throw new PlayPlusException("This parentheses construction is not known");
            }
        }

        return ctx;
    }

    // Parse action
    private Object parseActionInstruction(PlayPlusParser.ActionInstructionContext ctx) {
        PlayPlusParser.ActionTypeContext action = (PlayPlusParser.ActionTypeContext)ctx.children.get(0);

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

        return parseIntegerRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(2));
    }

    // Parse declaration
    private Object parseVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx) {
        for (TerminalNode id : ctx.ID()) {

            if (ctx.variableType() instanceof  PlayPlusParser.ScalarContext)
            {
                TerminalNode variableType = (TerminalNode)ctx.variableType().children.get(0);

                this.application.addVariable(variableType.getText(), id.getText(), "", false);
            }
            else if (ctx.variableType() instanceof PlayPlusParser.ArrayContext)
            {
                PlayPlusParser.ArrayDefinitionContext arrayType = (PlayPlusParser.ArrayDefinitionContext)ctx.variableType().children.get(0);
                TerminalNode variableType = (TerminalNode)arrayType.children.get(0);

                this.application.addArray(variableType.getText(), id.getText(), ArrayHelper.getSize(arrayType));
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureContext) {
                PlayPlusParser.StructureDefinitionContext structureType = (PlayPlusParser.StructureDefinitionContext)ctx.variableType().children.get(0);
                TerminalNode structureName = (TerminalNode) structureType.children.get(0);

                this.application.addVariable(structureName.getText(), id.getText(), "", false);
            }
        }

        return ctx;
    }

    private Object parseStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx) {
        this.application.addRecord(ctx.ID().getText());

        for (ParseTree node : ctx.children) {
            if (node instanceof PlayPlusParser.VariableDefinitionContext) {
                parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)node);
            } else if (node instanceof PlayPlusParser.StructureDefinitionContext) {
                visitStructureDefinition((PlayPlusParser.StructureDefinitionContext)node);
            }
        }

        this.application.leaveContext();

        return  ctx;
    }

    private Object parseFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx) {
        TerminalNode returnTypeNode = null;
        PlayPlusParser.FunctionInstructionContext functionInstructionContext = null;

        for (int i = 0; i < ctx.children.size(); i++) {
            ParseTree node = ctx.children.get(i);

            if (node instanceof TerminalNode && ((TerminalNode) node).getSymbol().getType() == PlayPlusParser.COLON) {
                returnTypeNode = (TerminalNode) ctx.children.get(i + 1);
            } else if (node instanceof PlayPlusParser.FunctionInstructionContext) {
                functionInstructionContext = (PlayPlusParser.FunctionInstructionContext)node;
            }
        }

        this.application.addFunction(ctx.ID().getText(), returnTypeNode.getText());

        parseFunctionInstruction(functionInstructionContext);

        this.application.leaveContext();

        return ctx;
    }

    private Object parseFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx) {
        return ctx;
    }

    private Object parseAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx) {
        return parseAssignation((PlayPlusParser.AssignationContext)ctx.children.get(0));
    }

    private Object parseAssignation(PlayPlusParser.AssignationContext ctx) {
        // We check the validity of both expression
        PlayPlusParser.LeftExprContext leftExpression = (PlayPlusParser.LeftExprContext) ctx.children.get(0);
        PlayPlusParser.RightExprContext rightExpression = (PlayPlusParser.RightExprContext) ctx.children.get(2);

        VariableBase leftVariable = null;

        if (leftExpression instanceof PlayPlusParser.LeftIdContext) {
            TerminalNode id = ((PlayPlusParser.LeftIdContext) leftExpression).ID();
            leftVariable = this.application.getVariable(id.getText());
        } else if (leftExpression instanceof PlayPlusParser.LeftArrayContext) {
            TerminalNode id = ((PlayPlusParser.LeftArrayContext) leftExpression).ID();
            leftVariable = this.application.getArray(id.getText());
        } else {
            throw new PlayPlusException("This left expression as an assignation is not known");
        }

        if (rightExpression instanceof PlayPlusParser.NumberContext ||
                rightExpression instanceof PlayPlusParser.IntegerExpressionContext) {
            if (!leftVariable.getType().equals("integer")) {
                throw new PlayPlusException("The left and right type are not both integer");
            }

            parseIntegerRightExpression(rightExpression);
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
        } else {
            throw new PlayPlusException("This right expression as an assignation is not known");
        }


        // We check the type concordance

        return ctx;
    }

    private Object parseMainInstructionContext(PlayPlusParser.MainInstructionContext ctx) {
        for (Object node : ctx.children) {
            if (node instanceof PlayPlusParser.ActionInstructionContext) {
                parseActionInstruction((PlayPlusParser.ActionInstructionContext)node);
            } else if (node instanceof PlayPlusParser.AssignationInstructionContext) {
                parseAssignationInstruction((PlayPlusParser.AssignationInstructionContext)node);
            } else if (node instanceof PlayPlusParser.IfInstructionContext) {
                // TODO
            } else if (node instanceof PlayPlusParser.WhileInstructionContext) {
                // TODO
            } else if (node instanceof PlayPlusParser.ForInstructionContext) {
                // TODO
            } else if (node instanceof PlayPlusParser.DigInstructionContext) {
            } else if (node instanceof TerminalNode) {
            } else {
                throw new PlayPlusException("Not manage");
            }
        }

        return ctx;
    }
}
