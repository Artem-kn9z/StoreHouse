module com.example.storehaus {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.storehouse to javafx.fxml;
    exports com.storehouse;
    exports com.storehouse.ui.controller;
    opens com.storehouse.ui.controller to javafx.fxml;
    exports com.storehouse.ui;
    opens com.storehouse.ui to javafx.fxml;
}