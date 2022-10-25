module com.stulsoft.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stulsoft.hellofx to javafx.fxml;
    exports com.stulsoft.hellofx;
}