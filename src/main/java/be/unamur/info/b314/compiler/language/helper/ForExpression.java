package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class ForExpression {
    /**
     * Method that parse a for instruction
     * @param ctx current for instruction context
     * @param application current application
     * @return the for instruction context
     */
    public static Object parseForInstruction(PlayPlusParser.ForInstructionContext ctx, Application application) {
        return parseFor((PlayPlusParser.ForContext)ctx.forBlock(), application);
    }

    /**
     * Method that parse a regular for
     * @param ctx current for context
     * @param application current application
     * @return
     */
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
