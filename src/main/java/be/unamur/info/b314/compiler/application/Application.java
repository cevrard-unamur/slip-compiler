package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.exception.VariableException;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<String> errors = new ArrayList();

    private Context currentContext;

    public Application() {
        this.currentContext = new Context();
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public void addVariable(String type, String name, String value, Boolean isConstant) {
        try {
            this.currentContext.addVariable(new Variable(type, name, value, isConstant)); }
        catch (VariableException ex) {
            this.addError(ex.getMessage());
        }
    }

    public void addArray(String type, String name, Integer[] size){
        this.currentContext.addArray(new Array(name, type, size));
    }

    public void addFunction(String name, String returnType) {
        Function function = new Function(name, returnType, this.currentContext);
        this.currentContext.addFunction(function);
        this.currentContext = function;
    }

    public void addRecord(String name) {
        Record record = new Record(name, this.currentContext);
        this.currentContext.addRecord(record);
        this.currentContext = record;
    }

    public void leaveContext() {
        if (this.currentContext.parent == null) {
            throw new PlayPlusException("Trying to leave context without parent");
        }

        this.currentContext = this.currentContext.parent;
    }

    public Variable getVariable(String name) {
        Context context = this.currentContext;

        while (context != null) {
            VariableBase variable = context.getVariable(name);

            if (variable != null && variable instanceof Variable) {
                return (Variable)variable;
            }

            context = context.parent;
        }

        throw new VariableException("The variable " + name + " does not exist");
    }

    public Array getArray(String name) {
        Context context = this.currentContext;

        while (context != null) {
            VariableBase variable = context.getVariable(name);

            if (variable != null && variable instanceof Array) {
                return (Array)variable;
            }

            context = context.parent;
        }

        throw new VariableException("The array " + name + " does not exist");
    }
}
