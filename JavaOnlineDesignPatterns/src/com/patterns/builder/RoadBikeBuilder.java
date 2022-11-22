package com.patterns.builder;

import com.patterns.base.BikeInterface;
import com.patterns.base.RoadBike;

public class RoadBikeBuilder extends AbstractBikeBuilder {
    private RoadBike bikeInProgress;

    public RoadBikeBuilder(RoadBike bike) {
        this.bikeInProgress = bike;
    } // End constructor

    @Override
    public void buildStreetTires() {
        System.out.println("Building Street Tires...");
    } // End method buildStreetTires

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars...");
    } // End method buildHandleBars

    @Override
    BikeInterface getBike() {
        return bikeInProgress;
    } // End method getBike
} // End class
