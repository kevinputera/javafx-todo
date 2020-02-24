package javafx.todo.model;

/**
 * Represents an immutable todo item.
 */
public class Todo {
    private final String title;
    private final boolean done;

    public Todo(String title) {
        this(title, false);
    }

    public Todo(String title, boolean done) {
        this.title = title;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public Todo setTitle(String title) {
        return new Todo(title, done);
    }

    public boolean isDone() {
        return done;
    }

    public Todo setDone(boolean done) {
        return new Todo(title, done);
    }
}
