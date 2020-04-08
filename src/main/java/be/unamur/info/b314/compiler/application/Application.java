package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.PlayPlusParser;
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

    public void addVariable(String type, String name, Boolean isConstant) {
        try {
            if (name.equals("import")) {
                throw new VariableException("The name import cannot be used as a variable name");
            }
            if (name.equals("main")) {
                throw new VariableException("The name main cannot be used as a variable name");
            }
            if (isConstant && exist(name))
            {
                throw new VariableException("The name of a constant cannot be the same as an existing function");
            }
            this.currentContext.addVariable(new Variable(type, name, isConstant)); }
        catch (VariableException ex) {
            this.addError(ex.getMessage());
        }
    }

    public void addArray(String type, String name, Integer[] size){
        this.currentContext.addArray(new Array(name, type, size));
    }

    public void addEnum(String name, List<String> values) {
        this.currentContext.addEnum(new Enumeration(name, values));
    }

    public void addFunction(String name, String returnType) {
        Function function = new Function(name, returnType, this.currentContext);
        this.currentContext.addFunction(function);
        this.currentContext = function;
        // We add a first variable in the function context for the return of it
        if (returnType != "void") {
            this.currentContext.addVariable(new Variable(returnType, name, false));
        }
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

    public Array getArrayOfRecord(String name, String propertyName) {
        Context context = this.currentContext;

        while (context != null) {
            Record record = context.getRecord(name);

            if (record != null) {
                VariableBase variable = record.getVariable(propertyName);

                if (variable != null && variable instanceof Array) {
                    return (Array)variable;
                }
            }

            context = context.parent;
        }

        throw new VariableException("The array " + propertyName + " does not exist in the record " + name);
    }

    public Variable getVariableOfRecord(String name, String propertyName) {
        Context context = this.currentContext;

        while (context != null) {
            Record record = context.getRecord(name);

            if (record != null) {
                VariableBase variable = record.getVariable(propertyName);

                if (variable != null && variable instanceof Variable) {
                    return (Variable)variable;
                }
            }

            context = context.parent;
        }

        throw new VariableException("The variable " + propertyName + " does not exist in the record " + name);
    }

    public Function getFunction(String name) {
        Context context = this.currentContext;

        while (context != null) {
            Function function = context.getFunction(name);

            if (function != null) {
                return function;
            }

            context = context.parent;
        }

        throw new VariableException("The function " + name + " does not exist");
    }

    private boolean exist(String name)
    {
        boolean found = false;
        for (Function var : this.currentContext.functions)
        {
            found = var.getName().equals(name);
        }
        return found;
    }
}
