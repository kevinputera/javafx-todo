package javafx.todo.controller;

public class ControllerManager implements Controller {
    private final TodoListController todoListController;

    public ControllerManager(TodoListController todoListController) {
        this.todoListController = todoListController;
    }

    @Override
    public void addTodo(String title) {
        todoListController.addTodo(title);
    }

    @Override
    public void setDone(int id, boolean done) {
        todoListController.setDone(id, done);
    }
}
