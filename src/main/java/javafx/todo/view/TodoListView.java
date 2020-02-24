package javafx.todo.view;

import javafx.todo.controller.Controller;
import javafx.todo.model.Model;
import javafx.todo.model.Todo;
import javafx.scene.control.ListView;

public class TodoListView extends ListView<Todo> {
    public TodoListView(Controller controller, Model model) {
        super(model.getTodos());
    }
}
