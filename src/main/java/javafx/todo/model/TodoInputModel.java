package javafx.todo.model;

import javafx.beans.property.StringProperty;

public interface TodoInputModel {
    StringProperty inputProperty();
    String getInput();
    void setInput(String input);
}
