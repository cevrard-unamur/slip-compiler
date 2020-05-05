package be.unamur.info.b314.compiler.application;

public class VariableBase {
    protected String type;
    protected String name;
    protected String context;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getContext() {
        return context;
    }

    public String getNameAndContext() {
        if (this.context == null) {
            return this.name;
        }

        return String.format("%s_%s", this.name, this.context);
    }
}
