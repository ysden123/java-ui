/*
 * Copyright (c) , 2022. StulSoft
 */

package com.stulsoft.common.lib.alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class WarnAlert {
    public static void warn(String title, String alertMessage){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(alertMessage);

        alert.show();
    }
}
