package com.stulsoft.alerts.common;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class ConfirmAlert {
    public static void confirm(String title, String alertMessage, Runnable f){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.getButtonTypes().add(ButtonType.CANCEL);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(alertMessage);

        alert.showAndWait().ifPresent(bt ->{
            if (!bt.getButtonData().isCancelButton()) {
                f.run();
            }
        });
    }
}
