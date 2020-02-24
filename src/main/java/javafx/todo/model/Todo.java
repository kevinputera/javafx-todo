package javafx.todo.model;

/**
 * Represents an immutable todo item.
 */
public class Todo {
    private final int id;
    private final String title;
    private final boolean done;

    public Todo(int id, String title) {
        this(id, title, false);
    }

    public Todo(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public Todo setDone(boolean done) {
        return new Todo(id, title, done);
    }
}
