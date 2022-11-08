package com.storehouse.ui.controller;

import com.storehouse.FxmlLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;


import java.io.IOException;

public class StorehausController {

    @FXML
    private MenuItem close;

    @FXML
    private Button workingWithStorehausButton;

    @FXML
    private Button workingWithWorkersButton;

    @FXML
    void closeProgram(ActionEvent event) {

    }
    @FXML
    void workingWithStorehausButton1() {
            workingWithStorehausButton.getScene().getWindow().hide();
            FxmlLoader fxmlLoader1 = new FxmlLoader();
            try {
                fxmlLoader1.fxmlLoader("StorehausMenu.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    @FXML
    void workingWithWorkersButton1() {
            workingWithWorkersButton.getScene().getWindow().hide();
            FxmlLoader fxmlLoader2 = new FxmlLoader();
            try {
                fxmlLoader2.fxmlLoader("WorkersMenu.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

}
