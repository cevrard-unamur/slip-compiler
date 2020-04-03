package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.exception.BooleanRightExpressionException;
import be.unamur.info.b314.compiler.exception.IncorrectTypeException;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExpressionVisitor extends PlayPlusBaseVisitor {
    private Application application;

    public ExpressionVisitor(Application application) {
        this.application = application;
    }

    @Override
    public Object visitIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx) {
        return parseIntegerExpression(ctx);
    }

    @Override
    public Object visitParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseParenthesesExpression(ctx);
    }

    @Override
    public Object visitBoolExpression(PlayPlusParser.BoolExpressionContext ctx) {
        return parseBooleanExpression(ctx);
    }

    @Override
    public Object visitAction(PlayPlusParser.ActionContext ctx) {
        if (ctx.children.size() == 3) {
            return super.visitAction(ctx);
        }

        return parseIntegerRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(2));
    }

    @Override
    public Object visitNotExpression(PlayPlusParser.NotExpressionContext ctx) {
        return parseBooleanRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(1));
    }

    // Parse a boolean expression
    private Object parseBooleanExpression(PlayPlusParser.BoolExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
        PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

        parseBooleanRightExpression(leftChild);
        parseBooleanRightExpression(rightChild);

        return ctx;
    }

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
            } else {
                throw new BooleanRightExpressionException("Cannot parse this as a boolean expression");
            }
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private Object parseBooleanLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        return parseLeftExpression(ctx, "boolean");
    }

    private Object parseBooleanParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseBooleanRightExpression((PlayPlusParser.RightExprContext)ctx.children.get(1));
    }

    // Parse a integer expression
    private Object parseIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx) {
        PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
        PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

        parseIntegerRightExpression(leftChild);
        parseIntegerRightExpression(rightChild);

        return ctx;
    }

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
            } else {
                throw new PlayPlusException("This parentheses construction is not known");
            }
        }

        return ctx;
    }
}
