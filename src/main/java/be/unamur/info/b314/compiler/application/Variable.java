package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.ConstantException;

public class Variable extends VariableBase {
    private String value;
    private Boolean isConstant;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (this.isConstant) {
            throw new ConstantException("A constant cannot be modified");
        }

        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Variable(String type, String name, String value, Boolean isConstant) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.isConstant = isConstant;
    }
}
