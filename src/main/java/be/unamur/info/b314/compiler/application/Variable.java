package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

public class Variable extends VariableBase {
    /**
     * True of the variable is a constant; otherwise false.
     */
    private Boolean isConstant;

    /**
     * Gets if the variable is a constant or not.
     * @return
     */
    public Boolean getConstant() { return isConstant; }

    /**
     * Sets the value of the variable.
     * @param value the value of the variable.
     * @throws PlayPlusException if the variable is a constant.
     */
    public void setValue(String value) {
        if (this.isConstant) {
            throw new PlayPlusException("A constant cannot be modified");
        }
    }

    /**
     * Initializes a new instance of a variable.
     * @param type the type of the variable.
     * @param name the name of the variable.
     * @param isConstant if the variable is a constant or not.
     * @param context the context name in which the variable is created.
     */
    public Variable(String type, String name, Boolean isConstant, String context) {
        this.type = type;
        this.name = name;
        this.isConstant = isConstant;
        this.context = context;
    }
}
