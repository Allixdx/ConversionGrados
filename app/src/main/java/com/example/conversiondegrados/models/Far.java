package com.example.conversiondegrados.models;

import java.text.DecimalFormat;

public class Far extends Grado {

    public Far(Double valor, String unidad) {
        super(valor, unidad);
    }

    public static Far fromCel(Double celValue) {
        double farValue = celValue * 9 / 5 + 32;
        farValue = Double.parseDouble(decimalFormat.format(farValue));
        return new Far(farValue, "F");
    }

    public static Far fromKel(Double kelValue) {
        double farValue = (kelValue - 273.15) * 9 / 5 + 32;
        farValue = Double.parseDouble(decimalFormat.format(farValue));
        return new Far(farValue, "F");
    }
}