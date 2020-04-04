package be.unamur.info.b314.compiler.application;

public class Function extends Context {
    private String name;
    private String returnType;

    public String getName() {
        return name;
    }

    public String getReturnType() { return returnType; }

    public Function(String name, String returnType, Context parent) {
        this.name = name;
        this.returnType = returnType;
        super.parent = parent;
    }
}
