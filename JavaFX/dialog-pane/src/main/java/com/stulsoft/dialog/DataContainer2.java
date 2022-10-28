package com.stulsoft.dialog;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Data container without bidirectional binding
 */
public class DataContainer2 {
    private String name;

    public DataContainer2(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
