package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.NBCIntCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.OperatorWriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class IntegerExpression {
    /**
     * The integer identifier for the temporary variable.
     */
    private static int integerId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String integerTemporaryVariable = "__integerVariable";

    /**
     * Gets the name of the temporary variable use for the integer.
     * @return the name of the temporary variable use for the integer.
     */
    private static String getIntegerName() { return IntegerExpression.integerTemporaryVariable + IntegerExpression.integerId; }

    /**
     * Enters an integer expression context to write the NBC code of it.
     * @param context the integer expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the integer expression.
     */
    public static String enterIntegerExpression(
            PlayPlusParser.IntegerExpressionContext context,
            Application application,
            PrintWriter writer
    ) {
        String integerVariable = IntegerExpression.getIntegerName();
        // We get the math operator
        TerminalNode mathNode = (TerminalNode) (context.getChild(1));
        int symbol = mathNode.getSymbol().getType();

        NBCIntCodeTypes mathOpCode = IntegerHelper.integerToNbcOpCodeType(symbol);

        OperatorWriter.writeMathCondition(
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

    /**
     * Enters in a negative integer expression context to write the NBC code of it.
     * @param context the negative integer expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the integer expression.
     */
    public static String enterNegativeIntegerExpression(
            PlayPlusParser.NegativeIntegerExpressionContext context,
            Application application,
            PrintWriter writer
    ){
        String negativeVariable = IntegerExpression.getIntegerName();

        OperatorWriter.writeNegCondition(
                writer,
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
