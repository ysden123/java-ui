package com.stulsoft.dialog;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Window;

import java.util.Objects;

public class DialogViewController2 extends Dialog<DataContainer2> {
    @FXML
    private TextField name;
    private final DataContainer2 data;

    public DialogViewController2(Window owner, DataContainer2 dataContainer) {
        this.data = dataContainer;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("dialog-view2.fxml"));
            loader.setController(this);

            DialogPane dialogPane = loader.load();

            initOwner(owner);
            initModality(Modality.APPLICATION_MODAL);

            setResizable(true);
            setTitle("Edit dialog");
            setDialogPane(dialogPane);

            setResultConverter(buttonType -> {
                if (!Objects.equals(ButtonBar.ButtonData.APPLY, buttonType.getButtonData())) {
                    return null;
                }
                updateData();
                return data;
            });

            fillData();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void fillData(){
        name.setText(data.getName());
    }

    private void updateData(){
        data.setName(name.getText());
    }
}
