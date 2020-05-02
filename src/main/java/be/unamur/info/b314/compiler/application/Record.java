package be.unamur.info.b314.compiler.application;

public class Record extends Context {
    private String name;

    public String getName() {
        return name;
    }

    public Context getParent() { return parent; }

    public Record(String name, Context parent) {
        this.name = name;
        super.parent = parent;
    }
}
