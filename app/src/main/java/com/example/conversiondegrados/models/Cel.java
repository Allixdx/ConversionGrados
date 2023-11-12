package com.example.conversiondegrados.models;

public class Cel extends Grado {
    public Cel(Double valor, String unidad) {
        super(valor, unidad);
    }

    public static Cel fromFar(Double farValue) {
        double celValue = (farValue - 32) * 5 / 9;
        celValue = Double.parseDouble(decimalFormat.format(celValue));
        return new Cel(celValue, "C");
    }

    public static Cel fromKel(Double kelValue) {
        double celValue = kelValue - 273.15;
        celValue = Double.parseDouble(decimalFormat.format(celValue));
        return new Cel(celValue, "C");
    }
}