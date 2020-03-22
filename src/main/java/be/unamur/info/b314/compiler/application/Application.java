package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private Context currentContext;

    public Application() {
        this.currentContext = new Context();
    }

    public void addVariable(String type, String name, String value, Boolean isConstant) {
        this.currentContext.addVariable(new Variable(type, name, value, isConstant));
    }

    public void updateVariable(String name, String value) {
        this.currentContext.updateVariable(name, value);
    }

    public void addFunction(String name, String value) {
        this.currentContext.addFunction(new Function(name, value));
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
}
