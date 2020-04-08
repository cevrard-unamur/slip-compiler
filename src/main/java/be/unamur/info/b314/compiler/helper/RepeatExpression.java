package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class RepeatExpression {
    public static Object parseRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx, Application application) {
        return RepeatExpression.parseRepeat((PlayPlusParser.RepeatContext)ctx.repeatBlock(), application);
    }

    public static Object parseRepeat(PlayPlusParser.RepeatContext ctx, Application application) {
        BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);

        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            DeclarationExpression.parseInstruction(instruction, application);
        }

        return ctx;
    }
}
