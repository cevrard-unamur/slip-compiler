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
<<<<<<< HEAD
     * Method that returns the type of the variable.
=======
     * Gets the type of the variable.
>>>>>>> master
     * @return the type of the variable.
     */
    public String getType() {
        return type;
    }

    /**
<<<<<<< HEAD
     * Method that return the name of the variable.
=======
     * Gets the name of the variable.
>>>>>>> master
     * @return the name of the variable.
     */
    public String getName() {
        return name;
    }

    /**
<<<<<<< HEAD
     * Method that return the context of the variable.
     * @return the context of the variable.
=======
     * Gets the context name of the variable.
     * @return the context name of the variable.
>>>>>>> master
     */
    public String getContext() {
        return context;
    }

    /**
<<<<<<< HEAD
     * Method that gives the name and the context of a variable.
     * @return the name of the variable underscore the name of the context..
=======
     * Gets the name and the context name of the variable ('variableName_contextName').
     * @return the name and the context name of the variable ('variableName_contextName').
>>>>>>> master
     */
    public String getNameAndContext() {
        if (this.context == null || this.context == "") {
            return this.name;
        }

        return String.format("%s_%s", this.name, this.context);
    }
}
