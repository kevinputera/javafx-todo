package javafx.todo.view;

import javafx.todo.controller.Controller;
import javafx.todo.model.Model;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewManager implements View {
    private final Controller controller;
    private final Model model;

    public ViewManager(Controller controller, Model model) {
        this.controller = controller;
        this.model = model;
    }

    @Override
    public void start(Stage primaryStage) {
        Scene defaultScene = new Scene(new AppView(controller, model));
        primaryStage.setScene(defaultScene);
        primaryStage.show();
    }
}
