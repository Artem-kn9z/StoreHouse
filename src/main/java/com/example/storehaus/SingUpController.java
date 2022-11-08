package com.example.storehaus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingUpController {

    @FXML
    private TextField Login;

    @FXML
    private Label errorEnter;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button singUpButton;

    @FXML
    void SingUpButtonClick(){
        String loginText = Login.getText().trim();
        String loginPassword = PasswordField.getText().trim();

        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUserName(loginText);
        user.setPassword(loginPassword);

        ResultSet resultSet = dbHandler.getUserLogin(user);

        int counter = 0;

        while(true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }

        if(!loginText.equals("") && !loginPassword.equals("")){
            if(loginText.equals("admin") && loginPassword.equals("12345")){
                loginAdmin(loginText, loginPassword);
            } else if(counter >= 1) {
                loginUser(loginText, loginPassword);
            }
            else errorEnter.setText("Don't have this user");
        }else  errorEnter.setText("Login and password is empty");
    }

    private void loginAdmin(String loginText, String loginPassword) {
        singUpButton.getScene().getWindow().hide();
        FxmlLoader fxmlLoader = new FxmlLoader();
        try {
            fxmlLoader.fxmlLoader("selectionWindow.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loginUser(String loginText, String loginPassword) {
        singUpButton.getScene().getWindow().hide();
        FxmlLoader fxmlLoader = new FxmlLoader();
        try {
            fxmlLoader.fxmlLoader("StorehausMenu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

