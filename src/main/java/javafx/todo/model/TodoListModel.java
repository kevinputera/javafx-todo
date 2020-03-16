package javafx.todo.model;

import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

public interface TodoListModel {
    TreeItem<Todo> getTodos();
    void addTodo(String title);
    void setDone(int id, boolean done);
}
