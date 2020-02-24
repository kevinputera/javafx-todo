package javafx.todo.controller;

import javafx.beans.property.StringProperty;

public interface TodoInputController {
    StringProperty inputProperty();
    void setInput(String input);
}
