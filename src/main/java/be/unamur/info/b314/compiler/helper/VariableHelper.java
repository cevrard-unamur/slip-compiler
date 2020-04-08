package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableHelper {
    protected static void addVariable(PlayPlusParser.ScalarTypeContext ctx, TerminalNode id, boolean isConstant, Application application) {
        TerminalNode variableType = ctx.SCALAR();

        application.addVariable(variableType.getText(), id.getText(), isConstant);
    }

    protected static void addArray(PlayPlusParser.ArrayTypeContext ctx, TerminalNode id, Application application) {
        PlayPlusParser.ArrayContext arrayType = (PlayPlusParser.ArrayContext)ctx.children.get(0);

        application.addArray(arrayType.SCALAR().getText(), id.getText(), ArrayHelper.getSize(arrayType));
    }

    protected static void addStructure(TerminalNode id, Application application) {
        application.addRecord(id.getText());
    }
}
