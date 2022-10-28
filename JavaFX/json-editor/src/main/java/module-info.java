module com.stulsoft.json.editor {
    requires javafx.controls;
    requires javafx.fxml;
    requires typesafe.config;

    opens com.stulsoft.json.editor to javafx.fxml;
    exports com.stulsoft.json.editor;
    exports com.stulsoft.json.editor.config;
    opens com.stulsoft.json.editor.config to javafx.fxml;
}