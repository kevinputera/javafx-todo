package javafx.todo.model;

import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoListModelImpl implements TodoListModel {
    private final IdGenerator idGenerator = new IdGenerator();
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
        todos.add(new Todo(idGenerator.getId(), title));
    }

    @Override
    public void setDone(int id, boolean done) {
        Todo todo = todos.stream().filter(t -> t.getId() == id).findFirst().orElseThrow();
        int index = todos.indexOf(todo);
        todos.set(index, todo.setDone(done));
    }
}
