module com.stulsoft.dialog{
    requires javafx.controls;
    requires javafx.fxml;

    opens com.stulsoft.dialog to javafx.fxml;
    exports com.stulsoft.dialog;
}