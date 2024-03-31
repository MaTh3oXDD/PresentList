package com.example.mcm;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


    public class Osoba {
        private final SimpleIntegerProperty id;
        private final SimpleStringProperty imie;
        private final SimpleStringProperty nazwisko;
        private final SimpleStringProperty numer_telefonu;
        private final SimpleIntegerProperty liczba_nieobecnosci;

        public Osoba(int id, String imie, String nazwisko, String numer_telefonu, int liczba_nieobecnosci) {
            this.id = new SimpleIntegerProperty(id);
            this.imie = new SimpleStringProperty(imie);
            this.nazwisko = new SimpleStringProperty(nazwisko);
            this.numer_telefonu = new SimpleStringProperty(numer_telefonu);
            this.liczba_nieobecnosci = new SimpleIntegerProperty(liczba_nieobecnosci);
        }




        // Gettery
        public int getId() {
            return id.get();
        }

        public String getImie() {
            return imie.get();
        }

        public String getNazwisko() {
            return nazwisko.get();
        }

        public String getNumerTelefonu() {
            return numer_telefonu.get();
        }

        public int getLiczbaNieobecnosci() {
            return liczba_nieobecnosci.get();
        }

        // Settery
        public void setId(int id) {
            this.id.set(id);
        }

        public void setImie(String imie) {
            this.imie.set(imie);
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko.set(nazwisko);
        }

        public void setNumerTelefonu(String numer_telefonu) {
            this.numer_telefonu.set(numer_telefonu);
        }

        public void setLiczbaNieobecnosci(int liczba_nieobecnosci) {
            this.liczba_nieobecnosci.set(liczba_nieobecnosci);
        }

        // Właściwości
        public SimpleIntegerProperty idProperty() {
            return id;
        }

        public SimpleStringProperty imieProperty() {
            return imie;
        }

        public SimpleStringProperty nazwiskoProperty() {
            return nazwisko;
        }

        public SimpleStringProperty numerTelefonuProperty() {
            return numer_telefonu;
        }

        public SimpleIntegerProperty liczbaNieobecnosciProperty() {
            return liczba_nieobecnosci;
        }

    }

