package javafx.todo.model;

public class IdGenerator {
    private int id = 1;
    
    public int getId() {
        return id++;
    }
}
