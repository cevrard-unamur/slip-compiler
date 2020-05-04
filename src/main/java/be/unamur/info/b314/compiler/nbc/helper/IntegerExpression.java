package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.LogicWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class IntegerExpression {
    private static int integerId = 1;
    private static final String integerTemporaryVariable = "__integerVariable";

    private static String getAssignationName() { return IntegerExpression.integerTemporaryVariable + IntegerExpression.integerId; }

    public static String enterCalc(PlayPlusParser.IntegerExpressionContext context, Application application, PrintWriter writer) {
        String integerVariable = IntegerExpression.getAssignationName();
        // We get the math operator
        TerminalNode mathNode = (TerminalNode) (context.getChild(1));
        int symbol = mathNode.getSymbol().getType();

        NBCOpCodeTypes mathOpCode = ComparisonHelper.comparisonToNbcOpCodeType(symbol);

        IfWriter.writeMathCondition(
                writer,
                mathOpCode,
                integerVariable,
                RightExpression.enterRightExpression(
                        context.rightExpr(0),
                        application,
                        writer
                ),
                RightExpression.enterRightExpression(
                        context.rightExpr(1),
                        application,
                        writer
                )
        );

        IntegerExpression.integerId++;
        return integerVariable;
    }

    public static String enterNeg(PlayPlusParser.NegativeIntegerExpressionContext context, Application application, PrintWriter writer){
        String negativeVariable = IntegerExpression.getAssignationName();
        // We get the negative operator
        TerminalNode negNode = (TerminalNode) (context.getChild(0));
        int symbol = negNode.getSymbol().getType();

        NBCOpCodeTypes negOpCode = ComparisonHelper.comparisonToNbcOpCodeType(symbol);

        IfWriter.writeNegCondition(
                writer,
                negOpCode,
                negativeVariable,
                RightExpression.enterRightExpression(
                        context.rightExpr(),
                        application,
                        writer
                )
        );

        IntegerExpression.integerId++;
        return negativeVariable;
    }
}
