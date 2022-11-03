module com.stulsoft.spring {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.annotation;

    requires spring.aop;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.boot;
    requires spring.context;
    requires spring.core;

    requires com.stulsoft.common.lib;

    opens com.stulsoft.spring to javafx.fxml, spring.core;
    exports com.stulsoft.spring;
}