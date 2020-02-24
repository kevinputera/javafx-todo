package javafx.todo.controller;

import javafx.beans.property.StringProperty;
import javafx.todo.model.Model;

public class TodoInputControllerImpl implements TodoInputController {
    private final Model model;

    public TodoInputControllerImpl(Model model) {
        this.model = model;
    }

    @Override
    public StringProperty inputProperty() {
        return model.inputProperty();
    }

    @Override
    public void setInput(String input) {
        model.setInput(input);
    }
}
