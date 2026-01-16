package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRoata {

    @Test
    public void testCalculeazaArie() {
        Roata r = new Roata(10);
        double expected = 2 * 3.14 * 10;
        assertEquals(expected, r.calculeazaArie(), 1e-9);
    }

    @Test
    public void testCalculeazaArieAltaRaza() {
        Roata r = new Roata(7);
        double expected = 2 * 3.14 * 7;
        assertEquals(expected, r.calculeazaArie(), 1e-9);
    }
}