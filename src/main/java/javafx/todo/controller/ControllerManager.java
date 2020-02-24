package javafx.todo.controller;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.todo.model.Model;
import javafx.todo.model.Todo;

public class ControllerManager implements Controller {
    private final TodoInputController todoInputController;
    private final TodoListController todoListController;

    public ControllerManager(Model model) {
        this.todoInputController = new TodoInputControllerImpl(model);
        this.todoListController = new TodoListControllerImpl(model);
    }

    @Override
    public StringProperty inputProperty() {
        return todoInputController.inputProperty();
    }

    @Override
    public void setInput(String input) {
        todoInputController.setInput(input);
    }

    @Override
    public ObservableList<Todo> getTodos() {
        return todoListController.getTodos();
    }

    @Override
    public void addTodo(String title) {
        todoListController.addTodo(title);
    }

    @Override
    public void setDone(int index, boolean done) {
        todoListController.setDone(index, done);
    }
}
