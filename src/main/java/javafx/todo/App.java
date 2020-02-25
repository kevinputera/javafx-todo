package javafx.todo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.todo.controller.Controller;
import javafx.todo.controller.ControllerManager;
import javafx.todo.controller.TodoListController;
import javafx.todo.controller.TodoListControllerImpl;
import javafx.todo.model.Model;
import javafx.todo.model.ModelManager;
import javafx.todo.model.TodoInputModel;
import javafx.todo.model.TodoInputModelImpl;
import javafx.todo.model.TodoListModel;
import javafx.todo.model.TodoListModelImpl;
import javafx.todo.view.View;
import javafx.todo.view.ViewManager;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        TodoInputModel todoInputModel = new TodoInputModelImpl();
        TodoListModel todoListModel = new TodoListModelImpl();
        Model model = new ModelManager(todoInputModel, todoListModel);

        TodoListController todoListController = new TodoListControllerImpl(model);
        Controller controller = new ControllerManager(todoListController);

        View view = new ViewManager(controller, model);
        view.start(primaryStage);
    }
}
