package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableHelper {
    protected static String addVariable(PlayPlusParser.ScalarTypeContext ctx, TerminalNode id, boolean isConstant, Application application) {
        TerminalNode variableType = ctx.SCALAR();

        application.addVariable(variableType.getText(), id.getText(), isConstant);

        return variableType.getText();
    }

    protected static Tuple<String, Integer[]> addArray(PlayPlusParser.ArrayTypeContext ctx, TerminalNode id, Application application) {
        PlayPlusParser.ArrayContext arrayType = (PlayPlusParser.ArrayContext)ctx.children.get(0);

        Integer[] arraySize = ArrayHelper.getSize(arrayType);

        application.addArray(arrayType.SCALAR().getText(), id.getText(), arraySize);

        return new Tuple<>(arrayType.SCALAR().getText(), arraySize);

    }

    protected static void addStructure(TerminalNode id, Application application) {
        application.addRecord(id.getText());
    }
}
