package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class IfExpression {
    public static Object parseIfInstruction(PlayPlusParser.IfInstructionContext ctx, Application application) {
        return IfExpression.parseIf((PlayPlusParser.IfContext)ctx.ifBlock(), application);
    }

    public static Object parseIf(PlayPlusParser.IfContext ctx, Application application) {
        BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);

        if (ctx.ifThenBlock() != null) {
            for (PlayPlusParser.InstContext instruction : ctx.ifThenBlock().inst()) {
                DeclarationExpression.parseInstruction(instruction, application);
            }
        }

        if (ctx.ifElseBlock() != null) {
            for (PlayPlusParser.InstContext instruction : ctx.ifElseBlock().inst()) {
                DeclarationExpression.parseInstruction(instruction, application);
            }
        }

        return ctx;
    }
}
