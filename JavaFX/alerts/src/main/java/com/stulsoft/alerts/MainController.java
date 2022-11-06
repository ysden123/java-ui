package com.stulsoft.alerts;


import com.stulsoft.common.lib.alerts.ConfirmAlert;
import com.stulsoft.common.lib.alerts.WarnAlert;
import javafx.event.ActionEvent;

public class MainController {
    public void onConfirm() {
        ConfirmAlert.confirm("Confirmation alert", "Do you want ...?",
                () -> System.out.println("Runnable!!!"));
    }

    public void onWarn(ActionEvent actionEvent) {
        WarnAlert.warn("Warning alert", "Pay attention ...");
    }
}
