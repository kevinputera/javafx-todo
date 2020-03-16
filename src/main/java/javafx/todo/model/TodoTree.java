package javafx.todo.model;

import java.util.List;

import javafx.scene.control.TreeItem;

public class TodoTree {
    // private Todo root;
    Todo rootTodo = new Todo(0, "Root");
    Todo stub1 = new Todo(1, "A");
    Todo stub2 = new Todo(2, "B");
    Todo stub3 = new Todo(3, "C");
    Todo stub4 = new Todo(4, "D");
    Todo stub5 = new Todo(5, "E");

    // public TodoTree() {
    //     this.root = new Todo(0, "Root");
    //     this.root.addChild(stub1);
    //     this.root.addChild(stub2);
    //     this.root.getChild(0).addChild(stub3);
    //     this.root.getChild(1).addChild(stub4);
    // }

    // public void addChild(Todo newTodo) {
    //     this.root.addChild(newTodo);
    // }

    // public Todo getRoot() {
    //     return this.root;
    // }

    // public Todo getChild(int index) {
    //     return this.root.getChild(index);
    // }

    TreeItem<Todo> root;

    public TodoTree() {
        root = new TreeItem<Todo>(rootTodo);
        root.getChildren().add(new TreeItem<Todo>(stub1));
    }

    public TreeItem<Todo> getTree() {
        return root;
    }

}