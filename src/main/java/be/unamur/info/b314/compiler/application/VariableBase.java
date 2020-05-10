package be.unamur.info.b314.compiler.application;

public class VariableBase {
    /**
     * The type of the variable.
     */
    protected String type;
    /**
     * The name of the variable.
     */
    protected String name;
    /**
     * The context name in which the variable is.
     */
    protected String context;

    /**
     * Gets the type of the variable.
     * @return the type of the variable.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the name of the variable.
     * @return the name of the variable.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the context name of the variable.
     * @return the context name of the variable.
     */
    public String getContext() {
        return context;
    }

    /**
     * Gets the name and the context name of the variable ('variableName_contextName').
     * @return the name and the context name of the variable ('variableName_contextName').
     */
    public String getNameAndContext() {
        if (this.context == null || this.context == "") {
            return this.name;
        }

        return String.format("%s_%s", this.name, this.context);
    }
}
