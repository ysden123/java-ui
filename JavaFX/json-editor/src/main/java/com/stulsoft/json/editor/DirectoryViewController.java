package com.stulsoft.json.editor;

import com.stulsoft.json.editor.config.Directory;
import javafx.collections.ObservableListBase;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.util.ArrayList;

public class DirectoryViewController {
    @FXML
    private ListView<Directory> directoryList;

    private Directory currentDirectory;
    private Number selectedIndex;

    @FXML
    void initialize() {
        var directories = new ArrayList<Directory>();
        for (int i = 0; i < 10; ++i) {
            var d = new Directory();
            d.setName("dir " + i);
            directories.add(d);
        }

        directoryList.setItems(new ObservableListBase<>() {
            @Override
            public Directory get(int index) {
                return (index >= 0 && index < size()) ? directories.get(index) : null;
            }

            @Override
            public int size() {
                return directories.size();
            }
        });

        directoryList.setCellFactory(new Callback<>() {
            @Override
            public ListCell<Directory> call(ListView<Directory> param) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(Directory item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setText(null);
                        } else {
                            setText(item.getName());
                        }
                    }
                };
            }
        });

        directoryList.getSelectionModel().selectedIndexProperty()
                .addListener((observable, oldValue, newValue) -> selectedIndex = newValue);

        directoryList.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> currentDirectory = newValue);
    }

    @FXML
    void onDirectoryClick(MouseEvent event) {
        if (event.getClickCount() == 2) {
            editDirectory(event);
        }
    }

    @FXML
    void onKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            editDirectory(event);
        }
    }

    private void editDirectory(Event event) {
        var directory = currentDirectory;
        var node = (Node) event.getSource();
        var parentScene = node.getScene();
        var parentWindow = parentScene.getWindow();
        DirectoryEditController dialogViewController = new DirectoryEditController(parentWindow, directory);
        dialogViewController.showAndWait().ifPresent(d ->
                this.directoryList.refresh()
        );
    }
}
