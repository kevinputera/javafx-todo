package javafx.todo.controller;

import javafx.todo.model.Model;

public class TodoListControllerImpl implements TodoListController {
    private final Model model;

    public TodoListControllerImpl(Model model) {
        this.model = model;
    }

    @Override
    public void addTodo(String title) {
        model.addTodo(title);
    }

    @Override
    public void setDone(int index, boolean done) {
        model.setDone(index, done);
    }
}
