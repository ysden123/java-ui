module com.stulsoft.alerts {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.stulsoft.alerts to javafx.fxml;
    exports com.stulsoft.alerts;
}