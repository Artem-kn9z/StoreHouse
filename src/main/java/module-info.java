module com.example.storehaus {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.storehaus to javafx.fxml;
    exports com.example.storehaus;
}