package com.example.mcm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TableView<AbsenceRecord> tableView;
    @FXML
    private TableColumn<AbsenceRecord, String> fullNameCol;
    @FXML
    private TableColumn<AbsenceRecord, String> courseNameCol;
    @FXML
    private TableColumn<AbsenceRecord, Number> numberOfAbsencesCol;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void initialize() {
        fullNameCol.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        numberOfAbsencesCol.setCellValueFactory(new PropertyValueFactory<>("numberOfAbsences"));

        // Załaduj dane do TableView
       // tableView.setItems(baza.getAbsencesData()); // Zakładając, że database jest już zainicjowane
    }

}