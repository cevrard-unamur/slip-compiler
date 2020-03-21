package be.unamur.info.b314.compiler.application;

public class Variable {
    private String type;
    private String name;
    private String value;

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Variable(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }
}
