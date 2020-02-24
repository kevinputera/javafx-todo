package javafx.todo.controller;

import javafx.todo.model.Model;

public class ControllerManager implements Controller {
    private final TodoInputController todoInputController;
    private final TodoListController todoListController;

    public ControllerManager(Model model) {
        this.todoInputController = new TodoInputControllerImpl(model);
        this.todoListController = new TodoListControllerImpl(model);
    }

    @Override
    public void setInput(String input) {
        todoInputController.setInput(input);
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
