package com.quantitymeasurement;

public enum OutputUnitIn {
    KILOGRAMS(0.001),
    LITRES(0.001);

    public final double value;

    OutputUnitIn(double value) {
        this.value=value;
    }
}
