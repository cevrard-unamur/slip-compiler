package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;

import java.util.ArrayList;
import java.util.List;

public class EnumExpression {
    /**
     * Method that parse an EnumerationDeclaration
     * @param ctx current EnumerationDeclaration context
     * @param application current application
     * @return the EnumerationDeclaration context
     */
    public static Object parseEnumerationDeclaration(PlayPlusParser.EnumDeclarationContext ctx, Application application) {
        EnumExpression.parseEnumeration((PlayPlusParser.EnumerationContext)ctx, application);

        return ctx;
    }

    /**
     * Method that parse an Enumeration
     * @param ctx current enumeration context
     * @param application current application
     * @return the enumeration context
     */
    public static Object parseEnumeration(PlayPlusParser.EnumerationContext ctx, Application application) {
        List<String> values = new ArrayList<>();

        for (int i = 1; i < ctx.ID().size(); i++) {
            if (values.contains(ctx.ID(i).getText())) {
                throw new PlayPlusException("Cannot have duplicate value in an enumeration - Enum: " + ctx.ID(0).getText() + " Value: " + ctx.ID(i).getText());
            }

            values.add(ctx.ID(i).getText());
        }

        application.addEnum(ctx.ID(0).getText(), values);

        return ctx;
    }
}
