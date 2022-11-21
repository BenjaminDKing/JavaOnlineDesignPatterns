package com.patterns.base;

import com.patterns.BikeColor;

public class Vintage extends RoadBike {

    public Vintage(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    } // End constructor

    public Vintage(WheelInterface wheel) {
        this(wheel, BikeColor.RED);
    } // End constructor

} // End class
