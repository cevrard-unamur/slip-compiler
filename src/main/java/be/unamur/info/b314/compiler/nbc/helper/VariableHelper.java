package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;

public class VariableHelper {
    /**
     * Cast a type code from ANTLR to an NBC code.
     * @param type the ANTLR type code.
     * @return the NBC op code.
     */
    public static NBCCodeTypes variableToNbcCodeType(String type) {
        switch (type) {
            case "integer":
                return NBCCodeTypes.Int;
            case "boolean":
                return NBCCodeTypes.Bool;
            case "char":
                return NBCCodeTypes.Char;
        }

        throw new PlayPlusException("There is no matching type for this type");
    }
}
