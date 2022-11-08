package com.example.storehaus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class WorkersController implements Initializable {

    @FXML
    private MenuItem createNewAcc;
    @FXML
    private TableView<User> table;
    @FXML
    private TableColumn<User, String> firstnameID;
    @FXML
    private TableColumn<User, String> lastnameID;
    @FXML
    private TableColumn<User, Integer> lastLineID;
    @FXML
    private TableColumn<User, Integer> nubOfLinID;
    @FXML
    private TableColumn<User, String> passwordID;
    @FXML
    private TableColumn<User, String> usernameID;
    @FXML
    private MenuItem workWithStorehaus;

    @FXML
    void Button1() {
        TableViewFun();
    }

    @FXML
    void createNewAcc1() {
        FxmlLoader fxmlLoader2 = new FxmlLoader();
        try {
            fxmlLoader2.fxmlLoader("createNewAcc.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void workiWithStorehaus11() {
                //workWithStorehaus.getScene().getWindow().hide();
                FxmlLoader fxmlLoader1 = new FxmlLoader();
                try {
                 fxmlLoader1.fxmlLoader("StorehausMenu.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableViewFun();
    }

    private void TableViewFun(){
        ObservableList <User> data = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();

        try {
            ResultSet resultSet = dbHandler.getDbConnection().createStatement().executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                data.add(new User(resultSet.getString("firstname"),  resultSet.getString("lastname"),
                                  resultSet.getString("username"),   resultSet.getString("password"),
                                  resultSet.getInt("numberoflines"), resultSet.getInt("lastlines")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        firstnameID.setCellValueFactory(new PropertyValueFactory("firstName"));
        lastnameID.setCellValueFactory(new PropertyValueFactory("lastName"));
        usernameID.setCellValueFactory(new PropertyValueFactory("userName"));
        passwordID.setCellValueFactory(new PropertyValueFactory("password"));
        nubOfLinID.setCellValueFactory(new PropertyValueFactory("nubOfLinID"));
        lastLineID.setCellValueFactory(new PropertyValueFactory("lastLineID"));

        table.setItems(null);
        table.setItems(data);

    }
}