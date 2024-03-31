package com.example.mcm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class baza {
    private Connection conn;

    public void Connect() {
        try {
            System.out.println("Próba ładowania sterownika...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Próba połączenia...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcm", "root", "");
            System.out.println("Połączenie nawiązane.");
        } catch (Exception e) {
            Logger.getLogger(baza.class.getName()).log(Level.SEVERE, "Połączenie nieudane", e);
        }
    }

    public ObservableList<Osoba> getAllOsoby() {
        ObservableList<Osoba> osoby = FXCollections.observableArrayList();
        String query = "SELECT id,imie,nazwisko,numer_telefonu FROM osoby;";
        try (PreparedStatement pst = conn.prepareStatement(query);)
            {
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    osoby.add(new Osoba(
                            rs.getInt("id"),
                            rs.getString("imie"),
                            rs.getString("nazwisko"),
                            rs.getString("numer_telefonu"),
                            0 // Ta wartość powinna być pobierana z odpowiedniego zapytania lub kolumny.
                    ));
                }
            } catch (Exception e)
            {
                Logger.getLogger(baza.class.getName()).log(Level.SEVERE, null, e);
            }
        return osoby;
    }
   public ObservableList<Zajecia> getAllZajecia()
    {
        ObservableList<Zajecia> zajecia = FXCollections.observableArrayList();
        String query = "SELECT zajecia.id as id,nazwa,imie,nazwisko FROM zajecia INNER  JOIN prowadzacy on prowadzacy.id=id_prowadzacego;";
        try (PreparedStatement pst = conn.prepareStatement(query);ResultSet rs = pst.executeQuery())
        {
            while (rs.next())
            {
                zajecia.add(new Zajecia(
                    rs.getInt("id"),
                    rs.getString("nazwa"),
                    rs.getString("imie"),
                    rs.getString("nazwisko")
                ));

            }
        }
        catch (SQLException e) {
            Logger.getLogger(baza.class.getName()).log(Level.SEVERE, null, e);
        }
        return zajecia;
    }


}
