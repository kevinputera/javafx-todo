package javafx.todo.model;

import java.util.Collection;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

public class TodoListModelImpl implements TodoListModel {
    private final IdGenerator idGenerator = new IdGenerator();
    private final TreeItem<Todo> todos;
    Property<Todo> currentTodo = new SimpleObjectProperty<Todo>();

    public TodoListModelImpl() {
        this(new TodoTree());
    }

    public TodoListModelImpl(TodoTree todoTree) {
        this.todos = todoTree.getTree();
    }

    @Override
    public TreeItem<Todo> getTodos() {
        return todos;
    }

    @Override
    public void addTodo(String title) {
        todos.getChildren().get(0).getChildren().add(new TreeItem<Todo>(new Todo(idGenerator.getId(), title)));
    }

    @Override
    public void setDone(int id, boolean done) {
        TreeItem<Todo> todo = (todos.getChildren()
            .stream()
            .filter(t -> t.getValue().getId() == id).
            findFirst().
            orElseThrow());
        int index = todos.getChildren().indexOf(todo);
        todos.getChildren().set(index, new TreeItem<Todo>(todo.getValue().setDone(done)));
    }
}
