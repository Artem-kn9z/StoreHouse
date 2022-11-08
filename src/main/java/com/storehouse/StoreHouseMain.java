package com.storehouse;

import com.storehouse.ui.UiNavigator;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class StoreHouseMain extends Application {
    UiNavigator uiNavigator;

    @Override
    public void start(Stage stage) throws IOException {
        UiNavigator.init( stage );

        UiNavigator.goTo(UiNavigator.View.SING_IN);
    }

    public static void main(String[] args) {launch();}
}