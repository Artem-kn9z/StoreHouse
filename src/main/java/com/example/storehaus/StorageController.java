package com.example.storehaus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;


public class StorageController implements Initializable {

    @FXML
    private TableView<Product> Table;

    @FXML
    private TableColumn<Product, String> barcode;

    @FXML
    private TableColumn<Product, String> nameProduct;

    @FXML
    private TableColumn<Product, String> number;

    @FXML
    private TableColumn<Product, String> numberInStorehaus;

    @FXML
    private TableColumn<Product, String> placeOnStorehaus;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Product> data = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();

        try {
            ResultSet resultSet = dbHandler.getDbConnection().createStatement().executeQuery("SELECT * FROM products");
            while (resultSet.next()) {
                data.add(new Product(resultSet.getString("nameProduct"),  resultSet.getString("barcode"),
                                     resultSet.getString("placeOnStorehaus"), resultSet.getString("number"),
                                     resultSet.getString("numberInStorage")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        nameProduct.setCellValueFactory(new PropertyValueFactory("productName"));
        barcode.setCellValueFactory(new PropertyValueFactory("Barcode"));
        placeOnStorehaus.setCellValueFactory(new PropertyValueFactory("placeOnStorehaus"));
        number.setCellValueFactory(new PropertyValueFactory("number"));
        numberInStorehaus.setCellValueFactory(new PropertyValueFactory("numberInStorage"));

        Table.setItems(null);
        Table.setItems(data);

    }
}

