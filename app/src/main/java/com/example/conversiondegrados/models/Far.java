package com.example.conversiondegrados.models;

public class Far extends Grado {
    public Far(Double valor, String unidad) {
        super(valor, unidad);
    }

    public static Far fromCel(Double celValue) {
        return new Far(celValue * 9 / 5 + 32, "F");
    }

    public static Far fromKel(Double kelValue) {
        return new Far((kelValue - 273.15) * 9 / 5 + 32, "F");
    }
}