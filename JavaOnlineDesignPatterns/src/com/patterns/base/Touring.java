package com.patterns.base;

import com.patterns.BikeColor;

public class Touring extends RoadBike {

    public Touring(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    } // End constructor

    public Touring(WheelInterface wheel) {
        this(wheel, BikeColor.BLUE);
    } // End constructor

    @Override
    public float getPrice() {
        return 570.00f;
    }
} // End class
