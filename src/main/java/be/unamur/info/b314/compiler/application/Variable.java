package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

public class Variable extends VariableBase {
    private Boolean isConstant;


    public Boolean getConstant() { return isConstant; }

    public void setValue(String value) {
        if (this.isConstant) {
            throw new PlayPlusException("A constant cannot be modified");
        }
    }

    public Variable(String type, String name, Boolean isConstant) {
        this.type = type;
        this.name = name;
        this.isConstant = isConstant;
    }
}
