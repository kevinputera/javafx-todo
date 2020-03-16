package javafx.todo.view;

import javafx.todo.controller.Controller;
import javafx.todo.model.Model;
import javafx.todo.model.Todo;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;

public class TodoListView extends TreeView<Todo> {
    private static class TodoListCell extends TreeCell<Todo> {
        private final Controller controller;

        public TodoListCell(Controller controller) {
            super();
            this.controller = controller;
        }

        @Override
        public void updateItem(Todo todo, boolean empty) {
            super.updateItem(todo, empty);
            if (empty || todo == null) {
                setText(null);
                setGraphic(null);
            } else {
                setText(String.format("%d. %s %s",
                        todo.getId(),
                        todo.getTitle(),
                        todo.isDone() ? "\u2713" : "\u2718"));
                setOnMouseClicked(mouseEvent -> {
                    controller.setDone(todo.getId(), !todo.isDone());
                });
            }
        }


    }

    private static final double PREF_HEIGHT = 250;

    public TodoListView(Controller controller, Model model) {
        super(model.getTodos());
        setPrefHeight(PREF_HEIGHT);
        setCellFactory(unused -> new TodoListCell(controller));
    }
}
