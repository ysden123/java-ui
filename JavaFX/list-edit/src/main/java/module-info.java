module com.stulsoft.list.edit {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.stulsoft.list.edit to javafx.fxml;
    exports com.stulsoft.list.edit;
}