package javafx.todo.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TodoInputModelImpl implements TodoInputModel {
    private final StringProperty input;

    public TodoInputModelImpl() {
        this("");
    }

    public TodoInputModelImpl(String initial) {
        input = new SimpleStringProperty(initial);
    }

    @Override
    public StringProperty inputProperty() {
        return input;
    }

    @Override
    public String getInput() {
        return input.getValue();
    }

    @Override
    public void setInput(String input) {
        this.input.setValue(input);
    }
}
