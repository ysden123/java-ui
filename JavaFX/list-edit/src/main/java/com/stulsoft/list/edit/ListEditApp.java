package com.stulsoft.list.edit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ListEditApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var containerProvider = new ContainerProvider();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("List Editor");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        ((MainController)fxmlLoader.getController()).setData(containerProvider.loadContainers());
    }

    public static void main(String[] args) {
        launch();
    }
}
