package com.example.storehaus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.cell.PropertyValueFactory;


import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

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
