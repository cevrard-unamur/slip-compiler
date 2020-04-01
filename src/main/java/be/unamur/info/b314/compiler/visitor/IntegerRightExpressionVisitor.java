package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class IntegerRightExpressionVisitor extends PlayPlusBaseVisitor {
    private Application application = Application.getInstance();

    private Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();

    public IntegerRightExpressionVisitor() {
        super();

        operations.put("+", IntegerRightExpressionVisitor::add);
        operations.put("-", IntegerRightExpressionVisitor::minus);
        operations.put("*", IntegerRightExpressionVisitor::product);
        operations.put("/", IntegerRightExpressionVisitor::div);
        operations.put("%", IntegerRightExpressionVisitor::mod);
    }

    @Override
    public Object visitIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx) {
        try {
            PlayPlusParser.RightExprContext leftChild = (PlayPlusParser.RightExprContext)ctx.children.get(0);
            TerminalNode operator = (TerminalNode) ctx.children.get(1);
            PlayPlusParser.RightExprContext rightChild = (PlayPlusParser.RightExprContext)ctx.children.get(2);

            return operations.get(operator.getText()).apply(parseChild(leftChild), parseChild(rightChild));
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private Integer parseChild(PlayPlusParser.RightExprContext ctx) {
        try {
            Integer value = 1;

            // We retrieve the value of the left child
            if (ctx instanceof PlayPlusParser.NumberContext) {
                value = Integer.parseUnsignedInt(((PlayPlusParser.NumberContext) ctx).NUMBER().getText());
            } else if (ctx instanceof PlayPlusParser.IntegerExpressionContext) {
                IntegerRightExpressionVisitor visitor = new IntegerRightExpressionVisitor();
                value = (Integer)visitor.visitIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx);
            } else if (ctx instanceof PlayPlusParser.ParenthesesExpressionContext) {
                System.out.println("Test");
            } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            } else if (ctx instanceof PlayPlusParser.CompExpressionContext) {
            } else if (ctx instanceof PlayPlusParser.BoolExpressionContext) {
            } else {
                throw new IntegerRightExpressionException("Cannot parse this expression");
            }

            return value;
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    private static Integer add(Integer value1, Integer value2) {
        return value1 + value2;
    }

    private static Integer minus(Integer value1, Integer value2) {
        return value1 - value2;
    }

    private static Integer product(Integer value1, Integer value2) {
        return value1 * value2;
    }

    private static Integer div(Integer value1, Integer value2) {
        return value1 / value2;
    }

    private static Integer mod(Integer value1, Integer value2) {
        return value1 % value2;
    }
}
