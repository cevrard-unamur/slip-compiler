package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.LogicWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class ComparisonExpression {
    /**
     * The comparison identifier for the temporary variable.
     */
    private static int comparisonId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String comparisonTemporaryVariable = "__comparisonVariable";

    /**
     * Gets the name of the temporary variable use for the comparison.
     * @return the name of the temporary variable use for the comparison.
     */
    private static String getComparisonName() { return ComparisonExpression.comparisonTemporaryVariable + ComparisonExpression.comparisonId; }

    /**
     * Enters in a comparison expression context to write the NBC code of it.
     * @param context the comparison expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the comparison result.
     */
    public static String enterCompExpression(PlayPlusParser.CompExpressionContext context, Application application, PrintWriter writer) {
        String comparisonVariable = ComparisonExpression.getComparisonName();
        // We get the comparison operator
        TerminalNode comparisonNode = (TerminalNode)(context.getChild(1));
        int symbol = comparisonNode.getSymbol().getType();

        NBCOpCodeTypes comparisonOpCode = ComparisonHelper.comparisonToNbcOpCodeType(symbol);

        IfWriter.writeCompareCondition(
                writer,
                comparisonOpCode,
                comparisonVariable,
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

        ComparisonExpression.comparisonId++;
        return comparisonVariable;
    }

    /**
     * Enters in a boolean context to write the NBC code of it.
     * @param context the boolean expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the comparison result.
     */
    public static String enterBoolean(PlayPlusParser.BoolExpressionContext context, Application application, PrintWriter writer) {
        String booleanVariable = ComparisonExpression.getComparisonName();
        // We get the boolean operator
        TerminalNode comparisonNode = (TerminalNode)(context.getChild(1));
        int symbol = comparisonNode.getSymbol().getType();

        switch (symbol) {
            case PlayPlusParser.AND:
                LogicWriter.writeAnd(
                        writer,
                        booleanVariable,
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
                break;
            case PlayPlusParser.OR:
                LogicWriter.writeOr(
                        writer,
                        booleanVariable,
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
                break;
        }

        ComparisonExpression.comparisonId++;
        return booleanVariable;
    }

    /**
     * Enters in a not expression context to write the NBC code if it.
     * @param context the not expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the not result.
     */
    public static String enterNot(PlayPlusParser.NotExpressionContext context, Application application, PrintWriter writer) {
        String booleanVariable = ComparisonExpression.getComparisonName();

        LogicWriter.writeNot(
                writer,
                booleanVariable,
                RightExpression.enterRightExpression(
                        context.rightExpr(),
                        application,
                        writer
                )
        );

        ComparisonExpression.comparisonId++;
        return booleanVariable;
    }
}
