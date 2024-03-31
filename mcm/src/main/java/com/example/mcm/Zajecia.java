package com.example.mcm;

public class Zajecia {
    private int id;
    private String nazwa;
    private String imie;
    private String nazwisko;

    // Konstruktor
    public Zajecia(int id, String nazwa, String imie, String nazwisko) {
        this.id = id;
        this.nazwa = nazwa;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    // Gettery i settery
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
