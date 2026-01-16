package com.example;

import java.util.ArrayList;
import java.util.List;

public class Masina {

    private String marca;
    private List<Roata> roti;

    // Constructor
    public Masina(String marca) {
        this.marca = marca;
        this.roti = new ArrayList<>();
    }

    // Metoda pentru adaugarea unei roti
    public void adaugaRoata(Roata roata) throws PreaMulteRoti {
        if (roti.size() >= 4) {
            throw new PreaMulteRoti();
        }
        roti.add(roata);
    }

    // Metoda pentru calcularea ariei totale a tuturor rotilor
    public double calculeazaArieTotala() {
        double suma = 0;
        for (Roata roata : roti) {
            suma += roata.calculeazaArie();
        }
        return suma;
    }
}