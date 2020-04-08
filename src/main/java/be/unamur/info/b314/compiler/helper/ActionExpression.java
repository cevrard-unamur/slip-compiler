package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class ActionExpression {
    public static Object parseActionInstruction(PlayPlusParser.ActionInstructionContext ctx, Application application) {
        PlayPlusParser.ActionTypeContext action = ctx.actionType();

        if (action instanceof PlayPlusParser.DigContext ||
                action instanceof PlayPlusParser.FightContext) {
            return ctx;
        }

        parseAction((PlayPlusParser.ActionContext)action, application);

        return ctx;
    }

    public static Object parseAction(PlayPlusParser.ActionContext ctx, Application application) {
        if (ctx.children.size() == 3) {
            return ctx;
        }

        return IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(), application);
    }
}
