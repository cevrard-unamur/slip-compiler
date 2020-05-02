package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;

public class ComparisonHelper {
    public static NBCOpCodeTypes comparisonToNbcOpCodeType(String opCode) {
        switch (opCode) {
            case "=":
                return NBCOpCodeTypes.Equal;
            case "<":
                return NBCOpCodeTypes.LessThan;
            case "<=":
                return NBCOpCodeTypes.LessThanOrEqual;
            case ">":
                return NBCOpCodeTypes.GreaterThan;
            case ">=":
                return NBCOpCodeTypes.GreaterThanOrEqual;
            case "<>":
                return NBCOpCodeTypes.NotEqual;
        }

        throw new PlayPlusException("There is no matching type for this type");
    }
}
