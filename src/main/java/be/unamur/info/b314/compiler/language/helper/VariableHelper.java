package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableHelper {
    /**
     * Method that add a variable to tu current application
     * @param ctx current context of a scalar variable
     * @param id id of the terminal node variable to add
     * @param isConstant parameter that is True if the variable is a constant False otherwise
     * @param application current application
     * @return the type of the variable that was added
     */
    protected static String addVariable(PlayPlusParser.ScalarTypeContext ctx, TerminalNode id, boolean isConstant, Application application) {
        TerminalNode variableType = ctx.SCALAR();

        application.addVariable(variableType.getText(), id.getText(), isConstant);

        return variableType.getText();
    }

    /**
     * Method that add an array to the current application
     * @param ctx current array type context
     * @param id id of the terminal node array to add
     * @param application current application
     * @return a tuple composed of the array type and the array composed of the number
     */
    protected static Tuple<String, Integer[]> addArray(PlayPlusParser.ArrayTypeContext ctx, TerminalNode id, Application application) {
        PlayPlusParser.ArrayContext arrayType = (PlayPlusParser.ArrayContext)ctx.children.get(0);

        Integer[] arraySize = ArrayHelper.getSize(arrayType);

        application.addArray(arrayType.SCALAR().getText(), id.getText(), arraySize);

        return new Tuple<>(arrayType.SCALAR().getText(), arraySize);

    }

    /**
     * Method that add a structure to the current application
     * @param id the terminal node structure id
     * @param application the current application
     */
    protected static void addStructure(TerminalNode id, Application application) {
        application.addRecord(id.getText());
    }
}
