package javafx.todo.view;

import javafx.scene.layout.VBox;
import javafx.todo.controller.Controller;
import javafx.todo.model.Model;

public class AppView extends VBox {
    public AppView(Controller controller, Model model) {
        super(new TodoInputView(controller, model), new TodoListView(controller, model));
    }
}
