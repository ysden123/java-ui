module com.stulsoft.list.edit {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    opens com.stulsoft.list.edit to javafx.fxml;
    exports com.stulsoft.list.edit;
}