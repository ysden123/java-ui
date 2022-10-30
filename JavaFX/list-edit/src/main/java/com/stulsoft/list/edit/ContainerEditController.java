package com.stulsoft.list.edit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Window;

import java.util.Objects;

public class ContainerEditController extends Dialog<Container> {
    @FXML
    private TextField name;

    private final Container data;

    public ContainerEditController(Window owner, Container data) {
        this.data = data;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("container-edit.fxml"));
            loader.setController(this);
            DialogPane dialogPane = loader.load();

            initOwner(owner);
            initModality(Modality.APPLICATION_MODAL);

            setResizable(true);
            setTitle("Container");
            setDialogPane(dialogPane);

            setResultConverter(buttonType -> {
                if (!Objects.equals(ButtonBar.ButtonData.APPLY, buttonType.getButtonData())) {
                    return null;
                }
                updateData();
                return data;
            });

            fillData();
            name.requestFocus();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void fillData() {
        name.setText(data.getName());
    }

    private void updateData() {
        data.setName(name.getText());
    }
}
