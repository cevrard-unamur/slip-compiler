package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class ForExpression {
    public static Object parseForInstruction(PlayPlusParser.ForInstructionContext ctx, Application application) {
        return parseFor((PlayPlusParser.ForContext)ctx.forBlock(), application);
    }

    public static Object parseFor(PlayPlusParser.ForContext ctx, Application application) {
        // We check if the right expression are both integer
        IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(0), application);
        BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(1), application);

        // We check if the instruction are correct
        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            DeclarationExpression.parseInstruction(instruction, application);
        }

        return  ctx;
    }
}
