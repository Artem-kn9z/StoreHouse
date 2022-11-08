package com.example.storehaus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StorehausMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StorehausMain.class.getResource("singUp.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 693, 592);
        stage.setTitle("Storehaus \" OOO how to cool \"");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}