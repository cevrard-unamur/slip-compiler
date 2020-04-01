package be.unamur.info.b314.compiler.application;

public class Function extends Context {
    private String name;

    public String getName() {
        return name;
    }

    public Function(String name, Context parent) {
        this.name = name;
        super.parent = parent;
    }
}
