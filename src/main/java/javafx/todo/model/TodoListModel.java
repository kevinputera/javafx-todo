package javafx.todo.model;

import javafx.collections.ObservableList;

public interface TodoListModel {
    ObservableList<Todo> getTodos();
    void addTodo(String title);
    void setDone(int id, boolean done);
}
