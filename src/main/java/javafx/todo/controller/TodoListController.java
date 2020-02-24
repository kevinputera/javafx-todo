package javafx.todo.controller;

public interface TodoListController {
    void addTodo(String title);
    void setDone(int id, boolean done);
}
