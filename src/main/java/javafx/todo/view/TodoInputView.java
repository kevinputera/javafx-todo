package javafx.todo.view;

import javafx.todo.controller.Controller;
import javafx.todo.model.Model;
import javafx.scene.control.TextField;

public class TodoInputView extends TextField {
    public TodoInputView(Controller controller, Model model) {
        textProperty().bindBidirectional(model.inputProperty());
        setOnAction(actionEvent -> {
            controller.addTodo(model.getInput());
            clear();
        });
    }
}
