package be.unamur.info.b314.compiler.application;

public class VariableBase {
    protected String type;
    protected String name;
    protected String context;

    /**
     * Method that returns the type of the variable.
     * @return the type of the variable.
     */
    public String getType() {
        return type;
    }

    /**
     * Method that return the name of the variable.
     * @return the name of the variable.
     */
    public String getName() {
        return name;
    }

    /**
     * Method that return the context of the variable.
     * @return the context of the variable.
     */
    public String getContext() {
        return context;
    }

    /**
     * Method that gives the name and the context of a variable.
     * @return the name of the variable underscore the name of the context..
     */
    public String getNameAndContext() {
        if (this.context == null) {
            return this.name;
        }

        return String.format("%s_%s", this.name, this.context);
    }
}
