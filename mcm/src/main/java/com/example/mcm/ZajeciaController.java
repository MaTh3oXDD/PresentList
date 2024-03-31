package com.example.mcm;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class ZajeciaController implements Initializable {
    @FXML
    private Label ZajeciaLabel;
    @FXML
    private TableView<Zajecia> Table;
    @FXML
    private TableColumn<Zajecia, Integer> IDColmn;
    @FXML
    private TableColumn<Zajecia, String> NazwaColmn;
    @FXML
    private TableColumn<Zajecia, String> ImieColmn;
    @FXML
    private TableColumn<Zajecia, String> NazwiskoColmn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        animacja.animateLabelBackgroundColor(ZajeciaLabel, Color.web("#F6F7EB"), Color.web("#383838"), 0.5);
        ZmianaSceny.ChangeSceneLabel(ZajeciaLabel,"hello-view.fxml","nowa");
        baza baza = new baza();
        baza.Connect();
        Table.setItems(baza.getAllZajecia());
        setDane();
    }
    public void setDane()
    {
        IDColmn.setCellValueFactory(new PropertyValueFactory<>("id"));
        NazwaColmn.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        ImieColmn.setCellValueFactory(new PropertyValueFactory<>("imie"));
        NazwiskoColmn.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
    }
}
