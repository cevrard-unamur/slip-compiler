package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class ActionExpression {
    /**
     * Method that parse an action instruction
     * @param ctx context of an action instruction
     * @param application Current application
     * @return current context
     */
    public static Object parseActionInstruction(PlayPlusParser.ActionInstructionContext ctx, Application application) {
        PlayPlusParser.ActionTypeContext action = ctx.actionType();

        if (action instanceof PlayPlusParser.DigContext ||
                action instanceof PlayPlusParser.FightContext) {
            return ctx;
        }

        parseAction((PlayPlusParser.ActionContext)action, application);

        return ctx;
    }

    /**
     * Method that parse a given action
     * @param ctx context of an action
     * @param application Current application
     * @return appropriate context
     */
    public static Object parseAction(PlayPlusParser.ActionContext ctx, Application application) {
        if (ctx.children.size() == 3) {
            return ctx;
        }

        return IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(), application);
    }
}
