package javafx.todo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an immutable todo item.
 */
public class Todo {
    private final int id;
    private final String title;
    private final boolean done;
    Todo parent;
    private List<Todo> children;

    public Todo(int id, String title) {
        this(id, title, false);
    }

    public Todo(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.children = new ArrayList<Todo>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Todo> getChildren() {
        return children;
    }

    public void addChild(Todo newTodo) {
        this.children.add(newTodo);
    }

    public Todo getChild(int index) {
        return this.children.get(index);
    }

    public boolean isDone() {
        return done;
    }

    public Todo setDone(boolean done) {
        return new Todo(id, title, done);
    }
}
