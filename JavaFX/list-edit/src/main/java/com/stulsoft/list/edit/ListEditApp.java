package com.stulsoft.list.edit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ListEditApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var containerProvider = new ContainerProvider();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("List Editor");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        MainController mainController = (MainController) fxmlLoader.getController();
        primaryStage.getScene().getWindow().addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, event -> {
            if (mainController.isDataChanged()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Closing...");
                alert.setHeaderText("Data were changed");
                alert.setContentText("To save containers?");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        mainController.onSave();
                    }
                });
            }
        });
        primaryStage.show();
        mainController.setData(containerProvider.loadContainers());
    }

    public static void main(String[] args) {
        launch();
    }
}
