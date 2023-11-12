package com.example.conversiondegrados.models;

public class Kel extends Grado {
    public Kel(Double valor, String unidad) {
        super(valor, unidad);
    }

    public static Kel fromCel(Double celValue) {
        double kelValue = celValue + 273.15;
        kelValue = Double.parseDouble(decimalFormat.format(kelValue));
        return new Kel(kelValue, "K");
    }

    public static Kel fromFar(Double farValue) {
        double kelValue = (farValue - 32) * 5 / 9 + 273.15;
        kelValue = Double.parseDouble(decimalFormat.format(kelValue));
        return new Kel(kelValue, "K");
    }
}