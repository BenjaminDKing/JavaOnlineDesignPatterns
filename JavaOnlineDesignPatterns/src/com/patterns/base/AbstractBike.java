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
    public float getPrice() {
        return 900.00f;
    }

    @Override
    public void paint(BikeColor color) {
        this.color = color;
    } // End method paint

    @Override
    public void airTires() {
        System.out.println("Airing up tires...");
    }

    @Override
    public void cleanFrame() {
        System.out.println("Cleaning frame...");
    }

    @Override
    public void testRide() {
        System.out.println("Taking bike out for a test ride...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ( " + wheel + " , " + color + ", price = $" + getPrice() + " )";
    } // End method toString

} // End class
