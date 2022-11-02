module com.stulsoft.alerts {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.stulsoft.common.lib;

    opens com.stulsoft.alerts to javafx.fxml;
    exports com.stulsoft.alerts;
}