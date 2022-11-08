package com.storehouse.ui.controller;

import com.storehouse.DatabaseHandler;
import com.storehouse.FxmlLoader;
import com.storehouse.User;
import com.storehouse.ui.UiNavigator;
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
    void SingUpButtonClick() {
        String loginText = Login.getText().trim();
        String loginPassword = PasswordField.getText().trim();

        if (loginText.equals("") || loginPassword.equals("")) {
            errorEnter.setText("Login and password is empty");
            return;
        }

        if (loginText.equals("admin") && loginPassword.equals("12345")) {
            loginAdmin();
            return;
        }

        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUserName(loginText);
        user.setPassword(loginPassword);

        ResultSet resultSet = dbHandler.getUserLogin(user);

        int counter = 0;

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }

        if (counter < 1) {
            errorEnter.setText("Don't have this user");
            return;
        }

        loginUser();
    }

    private void loginAdmin() {
        try {
            UiNavigator.goTo(UiNavigator.View.SELECTION_WINDOW);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loginUser() {
        try {
            UiNavigator.goTo(UiNavigator.View.MENU);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

