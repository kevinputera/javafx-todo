package javafx.todo.model;

import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoListModelImpl implements TodoListModel {
    private final ObservableList<Todo> todos;

    public TodoListModelImpl() {
        this(FXCollections.emptyObservableList());
    }

    public TodoListModelImpl(Collection<? extends Todo> todos) {
        this.todos = FXCollections.observableArrayList(todos);
    }

    @Override
    public ObservableList<Todo> getTodos() {
        return todos;
    }

    @Override
    public void addTodo(String title) {
        todos.add(new Todo(title));
    }

    @Override
    public void setDone(int index, boolean done) {
        todos.set(index, todos.get(index).setDone(done));
    }
}
