package com.stulsoft.spring;

import com.stulsoft.common.lib.alerts.ConfirmAlert;

public class MainController {
    public void onConfirm() {
        ConfirmAlert.confirm("Confirmation alert", "Do you want ...?",
                () -> {
                    System.out.println("Runnable!!!");
                    BinConfiguration.someService().makeWork();
                });
    }
}
