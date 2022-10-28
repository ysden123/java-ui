package com.stulsoft.dialog;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Data container with bidirectional binding
 */
public class DataContainer {
    private final StringProperty name = new SimpleStringProperty();

    public DataContainer(String name){
        this.name.set(name);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "name='" + name.getValue() + '\'' +
                '}';
    }

    public StringProperty nameProperty(){
        return name;
    }
}
