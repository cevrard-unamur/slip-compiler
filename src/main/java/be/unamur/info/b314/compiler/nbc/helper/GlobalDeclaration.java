package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.language.helper.Tuple;
import be.unamur.info.b314.compiler.language.helper.VariableExpression;
import be.unamur.info.b314.compiler.language.helper.VariableHelper;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class GlobalDeclaration {
    public static void globalDeclaration(PlayPlusParser.GlobalVariableContext ctx, Application application, PrintWriter writer) {
        for (ParseTree child : ctx.children) {
            if (child instanceof PlayPlusParser.VariableDefinitionContext) {
                GlobalDeclaration.variableDeclaration((PlayPlusParser.VariableDefinitionContext)child, application, writer);
            }
        }
    }

    private  static void variableDeclaration(PlayPlusParser.VariableDefinitionContext ctx, Application application, PrintWriter writer) {

        for (TerminalNode id : ctx.ID()) {
            if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext) {
                    GlobalDeclaration.parseInitializeScalarVariable(id.getText(), application, writer);
            } else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext) {
                GlobalDeclaration.parseInitializeArrayVariable(id.getText(), application, writer);
            }
        }
    }

    private static void parseInitializeScalarVariable(String id, Application application, PrintWriter writer) {
        VariableBase variable = application.getVariable(id);
        VariableWriter.printScalarInitialisation(
                writer,
                GlobalDeclaration.variableToNbcCodeType(variable.getType()),
                variable.getName());
    }

    private static void parseInitializeArrayVariable(String id, Application application, PrintWriter writer) {
        VariableBase variable = application.getArray(id);
        VariableWriter.printArrayInitialisation(
                writer,
                GlobalDeclaration.variableToNbcCodeType(variable.getType()),
                variable.getName());
    }

    private static NBCCodeTypes variableToNbcCodeType(String type) {
        switch (type) {
            case "integer":
                return NBCCodeTypes.Int;
            case "boolean":
                return NBCCodeTypes.Bool;
            case "char":
                return NBCCodeTypes.Char;
        }

        return  NBCCodeTypes.Int;
    }
}
