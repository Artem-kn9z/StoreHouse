package com.example.storehaus;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class InformationWindowController implements Initializable {

    @FXML
    private Label informationText;

    @FXML
    private Button okBatton;

    @FXML
    void okButton1() {
         okBatton.getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        informationText.setText(Const.txt);
    }
}
