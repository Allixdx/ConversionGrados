package com.example.conversiondegrados.models;

public class Kel extends Grado {
    public Kel(Double valor, String unidad) {
        super(valor, unidad);
    }

    public static Kel fromCel(Double celValue) {
        return new Kel(celValue + 273.15, "K");
    }

    public static Kel fromFar(Double farValue) {
        return new Kel((farValue - 32) * 5 / 9 + 273.15, "K");
    }
}