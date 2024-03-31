package com.example.mcm;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloController implements Initializable {
    @FXML
    private Label ZajeciaLabel;
    @FXML
    private TableView<Osoba> Table;
    @FXML
    private TableColumn<Osoba, Integer> IDColmn;
    @FXML
    private TableColumn<Osoba, String> ImieColmn;
    @FXML
    private TableColumn<Osoba, String> NazwiskoColmn;
    @FXML
    private TableColumn<Osoba, String> NumerColmn;
    @FXML
    private TableColumn<Osoba, Integer> ObecnoscColmn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        baza baza = new baza();
        baza.Connect();
        Table.setItems(baza.getAllOsoby());
        setData();
        animacja.animateLabelBackgroundColor(ZajeciaLabel, Color.web("#F6F7EB"), Color.web("#383838"), 0.5);
        ZmianaSceny.ChangeSceneLabel(ZajeciaLabel,"hello-view1.fxml","nowa");

    }
    public void setData()
    {
        IDColmn.setCellValueFactory(new PropertyValueFactory<>("id"));
        ImieColmn.setCellValueFactory(new PropertyValueFactory<>("imie"));
        NazwiskoColmn.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        NumerColmn.setCellValueFactory(new PropertyValueFactory<>("numerTelefonu"));
        ObecnoscColmn.setCellValueFactory(new PropertyValueFactory<>("liczbaNieobecnosci"));
    }



}