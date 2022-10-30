package com.stulsoft.list.edit;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
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
        this.items = FXCollections.observableArrayList(data);
        list.setItems(this.items);
    }

    public void onAddButtonClick() {
        // todo
        items.add(new Container("added item"));
        System.out.printf("data.size()=%d, list.getItems().size()=%d%n", items.size(), list.getItems().size());
    }

    public void onEdtButtonClick(MouseEvent event) {
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

    public void onDeleteButtonClick() {
        int index = list.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            items.remove(index);
            System.out.printf("data.size()=%d, list.getItems().size()=%d%n", items.size(), list.getItems().size());
        }
    }
}
