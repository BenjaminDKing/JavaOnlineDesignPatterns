package com.patterns.builder;

import com.patterns.base.BikeInterface;
import com.patterns.base.MountainBike;

public class MountainBikeBuilder extends AbstractBikeBuilder {

    private MountainBike bikeInProgress;

    public MountainBikeBuilder(MountainBike bike) {
        this.bikeInProgress = bike;
    } // End constructor

    @Override
    BikeInterface getBike() {
        return bikeInProgress;
    } // End method getBike

    @Override
    public void buildWideTires() {
        System.out.println("Building Wide Tires...");
    } // End method buildWideTires

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars...");
    } // End method buildHandleBars
} // End class
