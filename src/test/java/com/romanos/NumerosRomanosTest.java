package com.romanos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {

    private final NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void pasar1Aromanos() {
        String romano = numerosRomanos.convertirAromano(1);
        assertEquals(romano, "I");
    }

    @Test
    public void pasar2Aromanos() {
        String romano = numerosRomanos.convertirAromano(2);
        assertEquals(romano, "II");
    }

    @Test
    public void pasar3Aromanos() {
        String romano = numerosRomanos.convertirAromano(3);
        assertEquals(romano, "III");
    }

    @Test
    public void pasar4Aromanos() {
        String romano = numerosRomanos.convertirAromano(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void pasar5Aromanos() {
        String romano = numerosRomanos.convertirAromano(5);
        assertEquals(romano, "V");
    }

    @Test
    public void pasar6Aromanos() {
        String romano = numerosRomanos.convertirAromano(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void pasar7Aromanos() {
        String romano = numerosRomanos.convertirAromano(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void pasar8Aromanos() {
        String romano = numerosRomanos.convertirAromano(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void pasar9Aromanos() {
        String romano = numerosRomanos.convertirAromano(9);
        assertEquals(romano, "IX");
    }

    @Test
    public void pasar10Aromanos() {
        String romano = numerosRomanos.convertirAromano(10);
        assertEquals(romano, "X");
    }

    @Test
    public void pasar11Aromanos() {
        String romano = numerosRomanos.convertirAromano(11);
        assertEquals(romano, "XI");
    }

    @Test
    public void pasar12Aromanos() {
        String romano = numerosRomanos.convertirAromano(12);
        assertEquals(romano, "XII");
    }

    @Test
    public void pasar13Aromanos() {
        String romano = numerosRomanos.convertirAromano(13);
        assertEquals(romano, "XIII");
    }

    @Test
    public void pasar14Aromanos() {
        String romano = numerosRomanos.convertirAromano(14);
        assertEquals(romano, "XIV");
    }

    @Test
    public void pasar15Aromanos() {
        String romano = numerosRomanos.convertirAromano(15);
        assertEquals(romano, "XV");
    }

    @Test
    public void pasar16Aromanos() {
        String romano = numerosRomanos.convertirAromano(16);
        assertEquals(romano, "XVI");
    }

    @Test
    public void pasar17Aromanos() {
        String romano = numerosRomanos.convertirAromano(17);
        assertEquals(romano, "XVII");
    }

    @Test
    public void pasar18Aromanos() {
        String romano = numerosRomanos.convertirAromano(18);
        assertEquals(romano, "XVIII");
    }

    @Test
    public void pasar19Aromanos() {
        String romano = numerosRomanos.convertirAromano(19);
        assertEquals(romano, "XIX");
    }

    @Test
    public void pasar20Aromanos() {
        String romano = numerosRomanos.convertirAromano(20);
        assertEquals(romano, "XX");
    }

    @Test
    public void validarVeintenaNumerosRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
        List<String> romanos = new ArrayList<>();
        for (Integer number : numerosNaturales) {
            String s = numerosRomanos.convertirAromano(number);
            romanos.add(s);
        }
        assertEquals(romanos.get(0), "XX");
        assertEquals(romanos.get(1), "XXI");
        assertEquals(romanos.get(2), "XXII");
        assertEquals(romanos.get(3), "XXIII");
        assertEquals(romanos.get(4), "XXIV");
        assertEquals(romanos.get(5), "XXV");
        assertEquals(romanos.get(6), "XXVI");
        assertEquals(romanos.get(7), "XXVII");
        assertEquals(romanos.get(8), "XXVIII");
        assertEquals(romanos.get(9), "XXIX");
    }

    @Test
    public void validarTreintenaNumerosRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38, 39);
        List<String> romanos = numerosNaturales.stream()
                .map(numerosRomanos::convertirAromano)
                .collect(Collectors.toList());
        assertEquals(romanos.get(0), "XXX");
        assertEquals(romanos.get(1), "XXXI");
        assertEquals(romanos.get(2), "XXXII");
        assertEquals(romanos.get(3), "XXXIII");
        assertEquals(romanos.get(4), "XXXIV");
        assertEquals(romanos.get(5), "XXXV");
        assertEquals(romanos.get(6), "XXXVI");
        assertEquals(romanos.get(7), "XXXVII");
        assertEquals(romanos.get(8), "XXXVIII");
        assertEquals(romanos.get(9), "XXXIX");
    }

    @Test
    public void validarDecimalesNumerosRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(40, 50, 60, 70, 80, 90, 88, 67);
        List<String> romanos = new ArrayList<>();
        for (Integer number : numerosNaturales) {
            String s = numerosRomanos.convertirAromano(number);
            romanos.add(s);
        }
        assertEquals(romanos.get(0), "XL");
        assertEquals(romanos.get(1), "L");
        assertEquals(romanos.get(2), "LX");
        assertEquals(romanos.get(3), "LXX");
        assertEquals(romanos.get(4), "LXXX");
        assertEquals(romanos.get(5), "XC");
        assertEquals(romanos.get(6), "LXXXVIII");
        assertEquals(romanos.get(7), "LXVII");
    }

    @Test
    public void validarRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 3234);
        List<String> romanos = new ArrayList<>();
        for (Integer number : numerosNaturales) {
            String s = numerosRomanos.convertirAromano(number);
            romanos.add(s);
        }
        assertEquals(romanos.get(0), "C");
        assertEquals(romanos.get(1), "CC");
        assertEquals(romanos.get(2), "CCC");
        assertEquals(romanos.get(3), "CD");
        assertEquals(romanos.get(4), "D");
        assertEquals(romanos.get(5), "DC");
        assertEquals(romanos.get(6), "DCC");
        assertEquals(romanos.get(7), "DCCC");
        assertEquals(romanos.get(8), "CM");
        assertEquals(romanos.get(9), "MMMCCXXXIV");
    }

}
