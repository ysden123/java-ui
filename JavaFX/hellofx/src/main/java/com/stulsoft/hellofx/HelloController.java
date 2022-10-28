package com.stulsoft.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button button1;
    @FXML
    private Label welcomeText;
    @FXML
    private Button helloButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        button1.setDisable(false);
        helloButton.setDisable(true);
    }

    public void onButton1Click() {
        welcomeText.setText("Button 1 clicked");
        button1.setDisable(true);
        helloButton.setDisable(false);
    }
}