package com.example.storehaus;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxmlLoader{

    public void fxmlLoader(String nameFile) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(nameFile));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();

        Stage stage = new Stage();
        stage.setTitle("Storehaus \" OOO how to cool \"");
        stage.setScene(new Scene(root));
        stage.show();
    }

}

