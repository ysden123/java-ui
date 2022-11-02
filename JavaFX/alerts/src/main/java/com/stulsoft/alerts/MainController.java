package com.stulsoft.alerts;

import com.stulsoft.alerts.common.ConfirmAlert;

public class MainController {
    public void onConfirm() {
        ConfirmAlert.confirm("Confirmation alert", "Do you want ...?",
                () -> System.out.println("Runnable!!!"));
    }
}
