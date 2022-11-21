package com.patterns.base;

import com.patterns.BikeColor;

public abstract class MountainBike extends AbstractBike {

    protected MountainBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    } // End constructor

    protected MountainBike(WheelInterface wheel) {
        this(wheel, BikeColor.CHROME);
    } // End constructor

} // End class
