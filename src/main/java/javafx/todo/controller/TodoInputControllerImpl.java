package javafx.todo.controller;

import javafx.todo.model.Model;

public class TodoInputControllerImpl implements TodoInputController {
    private final Model model;

    public TodoInputControllerImpl(Model model) {
        this.model = model;
    }

    @Override
    public void setInput(String input) {
        model.setInput(input);
    }
}
