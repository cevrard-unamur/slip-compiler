package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.exception.IncorrectTypeException;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;
import be.unamur.info.b314.compiler.helper.Calculator;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class RightExpressionVisitor extends PlayPlusBaseVisitor {
    private Application application;
    private Calculator calculator = new Calculator();

    public RightExpressionVisitor(Application application) {
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
    public Object visitLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        return parseIntegerLeftExpression(ctx);
    }

    @Override
    public Object visitFunctionCallExpression(PlayPlusParser.FunctionCallExpressionContext ctx) {
        return super.visitFunctionCallExpression(ctx);
    }

    private Object parseRightIntegerExpression(PlayPlusParser.RightExprContext ctx) {
        try {
            if (ctx instanceof PlayPlusParser.NumberContext) {
                return ((PlayPlusParser.NumberContext)ctx).NUMBER();
            } else if (ctx instanceof PlayPlusParser.IntegerExpressionContext) {
                return parseIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx);
            } else if (ctx instanceof PlayPlusParser.ParenthesesExpressionContext) {
                return parseParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx);
            } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
                return parseIntegerLeftExpression((PlayPlusParser.LeftExpressionContext)ctx);
            } else {
                throw new IntegerRightExpressionException("Cannot parse this expression");
            }
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private Object parseIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx) {
        try {
            PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
            TerminalNode operator = (TerminalNode) ctx.children.get(1);
            PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

            Integer leftValue = Integer.parseUnsignedInt(parseRightIntegerExpression(leftChild).toString());
            Integer rightValue = Integer.parseUnsignedInt(parseRightIntegerExpression(rightChild).toString());

            return calculator.operations.get(operator.getText()).apply(leftValue, rightValue);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private Object parseParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx) {
        return parseRightIntegerExpression((PlayPlusParser.RightExprContext)ctx.children.get(1));
    }

    private Object parseIntegerLeftExpression(PlayPlusParser.LeftExpressionContext ctx) {
        PlayPlusParser.LeftExprContext leftContext = (PlayPlusParser.LeftExprContext)ctx.children.get(0);

        if (leftContext instanceof PlayPlusParser.LeftIdContext) {
            Variable variable = this.application.getVariable(leftContext.getText());

            if (!variable.getType().equals("integer")) {
                throw new IncorrectTypeException("The type of the variable is incorrect");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftArrayContext) {
            Array array = this.application.getArray(((PlayPlusParser.LeftArrayContext) leftContext).ID().getText());

            if (!array.getType().equals("integer")) {
                throw new IncorrectTypeException("The type of the variable is incorrect");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftPropertyContext) {
        }

        return 1;
    }
}
