package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.LogicWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

import static be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes.*;

public class ComparisonExpression {
    private static int comparisonId = 1;
    private static final String comparisonTemporaryVariable = "__comparisonVariable";

    private static String getAssignationName() { return ComparisonExpression.comparisonTemporaryVariable + ComparisonExpression.comparisonId; }

    public static String enterComp(PlayPlusParser.CompExpressionContext context, Application application, PrintWriter writer) {
        String comparisonVariable = ComparisonExpression.getAssignationName();
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

    public static String enterBoolean(PlayPlusParser.BoolExpressionContext context, Application application, PrintWriter writer) {
        String booleanVariable = ComparisonExpression.getAssignationName();
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

    public static String enterNot(PlayPlusParser.NotExpressionContext context, Application application, PrintWriter writer) {
        String booleanVariable = ComparisonExpression.getAssignationName();

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
