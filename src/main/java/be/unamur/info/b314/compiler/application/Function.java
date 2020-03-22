package be.unamur.info.b314.compiler.application;

public class Function extends Context {
    private String name;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Function(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
