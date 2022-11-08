package com.storehouse.ui;

import com.storehouse.StoreHouseMain;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UiNavigator {


    public enum View {SING_IN, MENU, SELECTION_WINDOW}

    static public void init(Stage stage) {
        UiNavigator.stage = stage;
    }

    static private Stage stage;

    static public void goTo(View view) throws IOException {
        String viewName = sceneToViewName(view);
        Parent newSceneParent;
        newSceneParent = FXMLLoader.load(StoreHouseMain.class.getResource(viewName));
        Scene scene = new Scene(newSceneParent, 693, 592);

        stage.setScene(scene);
        stage.setTitle("StoreHouse \" OOO how to cool \"");
        stage.show();
    }

    static private String sceneToViewName(View view) {
        switch (view) {

            case SING_IN:
                return "singUp.fxml";
            case SELECTION_WINDOW:
                return "selectionWindow.fxml";
            case MENU:
                return "StorehausMenu.fxml";
        }
        return null;
    }
}
