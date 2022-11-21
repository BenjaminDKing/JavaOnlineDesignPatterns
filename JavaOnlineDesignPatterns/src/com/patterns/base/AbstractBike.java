package com.patterns.base;

import com.patterns.BikeColor;

public abstract class AbstractBike implements BikeInterface {
    private WheelInterface wheel;
    private BikeColor color;

    protected AbstractBike(WheelInterface wheel, BikeColor color) {
      this.wheel = wheel;
      this.color = color;
    } // End constructor

    protected AbstractBike(WheelInterface wheel) {
        this(wheel, BikeColor.UNPAINTED);
    } // End constructor

    @Override
    public WheelInterface getWheel() {
        return wheel;
    } // End property getWheel

    @Override
    public BikeColor getColor() {
        return color;
    } // End property getColor

    @Override
    public void paint(BikeColor color) {
        this.color = color;
    } // End method paint

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ( " + wheel + " , " + color + " )";
    } // End method toString

} // End class
