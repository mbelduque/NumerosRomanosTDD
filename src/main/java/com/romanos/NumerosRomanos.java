package com.romanos;

import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    /**
     * Lista de unidades constantes en romano
     */
    private final static List<String> LISTA_NUMEROS_ROMANOS = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    /**
     * Convierte numeros naturales a romanos del 1 al 3999
     */
    public String convertirAromano(Integer numeroNatural) {
        int incr = 0;
        StringBuilder resultado = new StringBuilder();
        char[] digitosNumero = numeroNatural.toString().toCharArray();
        for (int i = digitosNumero.length - 1; i >= 0; i--) {
            String romano = construirRomano(Character.getNumericValue(digitosNumero[i]), incr, 1 + incr, 2 + incr);
            resultado.insert(0, romano);
            incr += 2;
        }
        return resultado.toString();
    }

    /**
     * Construye genericamente los números romanos a partir de los parametros
     */
    public String construirRomano(int decena, int x, int y, int z) {
        switch (decena) {
            case 4:
                return LISTA_NUMEROS_ROMANOS.get(x) + LISTA_NUMEROS_ROMANOS.get(y); // XL -> 40
            case 9:
                return LISTA_NUMEROS_ROMANOS.get(x) + LISTA_NUMEROS_ROMANOS.get(z); // XC -> 90
            default:
                return getStringRomano(decena, x, y);
        }
    }

    public String getStringRomano(int decena, int x, int y) {
        // Cubre los numeros del 10 al 30 (patron I + X)
        if (decena <= 3)
            return sumar(1, decena, "", LISTA_NUMEROS_ROMANOS.get(x));
        // Cubre los numeros del 50 al 80 (patron L + X)
        if (decena <= 8)
            return sumar(6, decena, LISTA_NUMEROS_ROMANOS.get(y), LISTA_NUMEROS_ROMANOS.get(x));
        return null;
    }

    /**
     * Agrega las unidades según el inicio del número romano a construir
     */
    public String sumar(int inicioCuenta, int numeroNatural, String inicioNumeroRomano, String incRomano) {
        StringBuilder inicioNumeroRomanoBuilder = new StringBuilder(inicioNumeroRomano);
        for (int i = inicioCuenta; i <= numeroNatural; i++) {
            inicioNumeroRomanoBuilder.append(incRomano);
        }
        inicioNumeroRomano = inicioNumeroRomanoBuilder.toString();
        return inicioNumeroRomano;
    }

}

