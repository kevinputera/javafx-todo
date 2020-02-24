package javafx.todo.controller;

public interface TodoListController {
    void addTodo(String title);
    void setDone(int index, boolean done);
}
