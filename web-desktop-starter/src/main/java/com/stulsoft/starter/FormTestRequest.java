package com.stulsoft.starter;

import java.io.Serializable;

public class FormTestRequest implements Serializable {
    private String formText;

    public FormTestRequest(String formText){
        this.formText=formText;
    }

    public String getFormText() {
        return formText;
    }

    @Override
    public String toString() {
        return "FormTestRequest{" +
                "formText='" + formText + '\'' +
                '}';
    }
}
