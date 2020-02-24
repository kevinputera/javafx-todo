package javafx.todo.controller;

public class ControllerManager implements Controller {
    private final TodoInputController todoInputController;
    private final TodoListController todoListController;

    public ControllerManager(TodoInputController todoInputController,
            TodoListController todoListController) {
        this.todoInputController = todoInputController;
        this.todoListController = todoListController;
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
    public void setDone(int id, boolean done) {
        todoListController.setDone(id, done);
    }
}
