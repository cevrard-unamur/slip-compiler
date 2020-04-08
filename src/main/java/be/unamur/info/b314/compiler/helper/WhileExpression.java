package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class WhileExpression {
    public static Object parseWhileInstruction(PlayPlusParser.WhileInstructionContext ctx, Application application) {
        return WhileExpression.parseWhile((PlayPlusParser.WhileContext)ctx.whileBlock(), application);
    }

    public static Object parseWhile(PlayPlusParser.WhileContext ctx, Application application) {
        BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);

        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            DeclarationExpression.parseInstruction(instruction, application);
        }

        return ctx;
    }
}
