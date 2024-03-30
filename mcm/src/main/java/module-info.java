module com.example.mcm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.mcm to javafx.fxml;
    exports com.example.mcm;
}