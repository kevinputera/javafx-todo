package javafx.todo.controller;

import javafx.collections.ObservableList;
import javafx.todo.model.Todo;

public interface TodoListController {
    ObservableList<Todo> getTodos();
    void addTodo(String title);
    void setDone(int index, boolean done);
}
