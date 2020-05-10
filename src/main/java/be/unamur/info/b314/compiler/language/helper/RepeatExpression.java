package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class RepeatExpression {
    /**
     * Method that parse a repeat instruction
     * @param ctx current repeat instruction context
     * @param application current application
     * @return the repeat context
     */
    public static Object parseRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx, Application application) {
        return RepeatExpression.parseRepeat((PlayPlusParser.RepeatContext)ctx.repeatBlock(), application);
    }

    /**
     * Method that parse repeat
     * @param ctx current repeat context
     * @param application current application
     * @return the repeat context
     */
    public static Object parseRepeat(PlayPlusParser.RepeatContext ctx, Application application) {
        BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);

        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            DeclarationExpression.parseInstruction(instruction, application);
        }

        return ctx;
    }
}
