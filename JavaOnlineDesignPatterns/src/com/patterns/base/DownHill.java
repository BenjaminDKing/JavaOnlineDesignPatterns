package com.patterns.base;

import com.patterns.BikeColor;

public class DownHill extends MountainBike {

    public DownHill(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    } // End constructor

    public DownHill(WheelInterface wheel) {
        this(wheel, BikeColor.GREEN);
    } // End constructor

    @Override
    public float getPrice() {
        return 870.00f;
    }
} // End class
