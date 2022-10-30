package com.stulsoft.list.edit;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.util.List;

public class MainController {
    @FXML
    private ListView<Container> list;

    ObservableList<Container> items;

    @FXML
    Button editButton;

    @FXML
    Button deleteButton;

    @FXML
    void initialize() {
        System.out.println("==>initialize");

        list.setCellFactory(new Callback<>() {
            @Override
            public ListCell<Container> call(ListView<Container> param) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(Container item, boolean empty) {
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
    }

    public void setData(List<Container> data) {
        items = FXCollections.observableArrayList(data);
        list.setItems(items);
        editButton.setDisable(items.isEmpty());
        deleteButton.setDisable(items.isEmpty());
    }

    public void onAddButtonClick(MouseEvent event) {
        var node = (Node) event.getSource();
        var parentScene = node.getScene();
        ContainerEditController containerEditController =
                new ContainerEditController(parentScene.getWindow(), new Container(""));
        containerEditController
                .showAndWait()
                .ifPresent(updatedContainer -> items.add(updatedContainer));
        editButton.setDisable(items.isEmpty());
        deleteButton.setDisable(items.isEmpty());
    }

    public void onEdtButtonClick(MouseEvent event) {
        editContainer(event);
    }

    public void onDeleteButtonClick() {
        int index = list.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            items.remove(index);
        }
        editButton.setDisable(items.isEmpty());
        deleteButton.setDisable(items.isEmpty());
    }

    public void onContainerClick(MouseEvent event){
        if (event.getClickCount() == 2) {
            editContainer(event);
        }
    }

    private void editContainer(Event event){
        int index = list.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Container container = items.get(index);
            var node = (Node) event.getSource();
            var parentScene = node.getScene();
            ContainerEditController containerEditController =
                    new ContainerEditController(parentScene.getWindow(), container);
            containerEditController
                    .showAndWait()
                    .ifPresent(updatedContainer -> items.set(index, updatedContainer));
        }
    }

    public void onSave() {
        var containerProvider = new ContainerProvider();
        containerProvider.saveContainers(items);
    }
}
