package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;

import java.io.PrintWriter;

import static be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes.*;

public class ComparisonExpression {
    private static int comparisonId = 1;
    private static final String comparisonTemporaryVariable = "__comparisonVariable";

    private static String getAssignationName() { return ComparisonExpression.comparisonTemporaryVariable + ComparisonExpression.comparisonId; }

    public static String enterComp(PlayPlusParser.CompExpressionContext context, Application application, PrintWriter writer) {
        String comparisonVariable = ComparisonExpression.getAssignationName();
        NBCOpCodeTypes comparisonOpCode = ComparisonHelper.comparisonToNbcOpCodeType(context.getChild(1).getText());

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

        return comparisonVariable;
    }
}
