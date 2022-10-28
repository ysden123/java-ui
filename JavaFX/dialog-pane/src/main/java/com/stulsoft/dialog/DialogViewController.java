package com.stulsoft.dialog;

import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Window;

import java.util.Objects;

public class DialogViewController extends Dialog<DataContainer> {
    @FXML
    private TextField name;
    private final ObjectProperty<DataContainer> data;

    public DialogViewController(Window owner, DataContainer dataContainer) {
        this.data = new SimpleObjectProperty<>(dataContainer);
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("dialog-view.fxml"));
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
                return data.getValue();
            });

            bind();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void bind(){
        Bindings.bindBidirectional(name.textProperty(), data.getValue().nameProperty());
    }
}
