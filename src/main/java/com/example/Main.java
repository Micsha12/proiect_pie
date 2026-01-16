package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Crearea rotilor cu raze diferite
            Roata r1 = new Roata(2);
            Roata r2 = new Roata(3);
            Roata r3 = new Roata(4);
            Roata r4 = new Roata(5);

            // Crearea unei masini
            Masina masina = new Masina("Dacia");

            // Adaugarea rotilor in colectie
            masina.adaugaRoata(r1);
            masina.adaugaRoata(r2);
            masina.adaugaRoata(r3);
            masina.adaugaRoata(r4);

            // Afisarea ariei totale
            System.out.println("Aria totala a rotilor este: " + masina.calculeazaArieTotala());

        } catch (PreaMulteRoti e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}