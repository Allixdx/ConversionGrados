package com.example.conversiondegrados.models;

public class Cel extends Grado {
    public Cel(Double valor, String unidad) {
        super(valor, unidad);
    }

    public static Cel fromFar(Double farValue) {
        return new Cel((farValue - 32) * 5 / 9, "C");
    }

    public static Cel fromKel(Double kelValue) {
        return new Cel(kelValue - 273.15, "C");
    }
}