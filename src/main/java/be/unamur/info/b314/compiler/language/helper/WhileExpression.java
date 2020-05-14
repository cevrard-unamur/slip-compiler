package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class WhileExpression {
    /**
     * Method that parse a while instruction
     * @param ctx current context of the while instruction
     * @param application current application
     * @return context of the current while instruction
     */
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
