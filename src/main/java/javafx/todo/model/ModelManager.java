package javafx.todo.model;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class ModelManager implements Model {
    private final TodoInputModel todoInputModel;
    private final TodoListModel todoListModel;

    public ModelManager(TodoInputModel todoInputModel, TodoListModel todoListModel) {
        this.todoInputModel = todoInputModel;
        this.todoListModel = todoListModel;
    }

    @Override
    public StringProperty inputProperty() {
        return todoInputModel.inputProperty();
    }

    @Override
    public String getInput() {
        return todoInputModel.getInput();
    }

    @Override
    public void setInput(String input) {
        todoInputModel.setInput(input);
    }

    @Override
    public ObservableList<Todo> getTodos() {
        return todoListModel.getTodos();
    }

    @Override
    public void addTodo(String title) {
        todoListModel.addTodo(title);
    }

    @Override
    public void setDone(int index, boolean done) {
        todoListModel.setDone(index, done);
    }
}
