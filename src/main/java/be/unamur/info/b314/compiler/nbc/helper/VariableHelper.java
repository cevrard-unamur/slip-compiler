package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;

public class VariableHelper {
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
