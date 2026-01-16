package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMasina {

    @Test
    public void testCalculeazaArieTotalaCu4Roti() throws PreaMulteRoti {
        Masina m = new Masina("Dacia");

        Roata r1 = new Roata(10);
        Roata r2 = new Roata(12);
        Roata r3 = new Roata(14);
        Roata r4 = new Roata(16);

        m.adaugaRoata(r1);
        m.adaugaRoata(r2);
        m.adaugaRoata(r3);
        m.adaugaRoata(r4);

        double expected = r1.calculeazaArie() + r2.calculeazaArie() +           r3.calculeazaArie() + r4.calculeazaArie();
        assertEquals(expected, m.calculeazaArieTotala(), 1e-9);
    }

    @Test
    public void testCalculeazaArieTotalaFaraRoti() {
        Masina m = new Masina("Audi");
        assertEquals(0.0, m.calculeazaArieTotala(), 1e-9);
    }
}