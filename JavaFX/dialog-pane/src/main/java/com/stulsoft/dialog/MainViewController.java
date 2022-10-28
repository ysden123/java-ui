package com.stulsoft.dialog;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class MainViewController {
    public void onShowDialog(MouseEvent event) {
        var dataContainer = new DataContainer("Initial name");
        var node = (Node) event.getSource();
        var parentScene = node.getScene();
        DialogViewController dialogViewController = new DialogViewController(parentScene.getWindow(), dataContainer);
        dialogViewController.showAndWait().ifPresent(System.out::println);
    }

    public void onShowDialog2(MouseEvent event) {
        var dataContainer = new DataContainer2("Initial name");
        var node = (Node) event.getSource();
        var parentScene = node.getScene();
        DialogViewController2 dialogViewController = new DialogViewController2(parentScene.getWindow(), dataContainer);
        dialogViewController.showAndWait().ifPresent(System.out::println);
    }
}
