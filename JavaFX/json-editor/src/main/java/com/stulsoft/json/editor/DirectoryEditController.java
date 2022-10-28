package com.stulsoft.json.editor;

import com.stulsoft.json.editor.config.Directory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Window;

import java.util.Objects;

public class DirectoryEditController extends Dialog<Directory> {
    private Directory directory;

    @FXML
    private TextField directoryName;

    public DirectoryEditController() {
    }

    public DirectoryEditController(Window owner, Directory directory) {
        this.directory = directory;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("directory-edit-dialog.fxml"));
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
                return directory;
            });

            fillData();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void fillData() {
        directoryName.setText(directory.getName());
    }

    private void updateData() {
        directory.setName(directoryName.getText());
    }
}
