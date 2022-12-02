package com.patterns.facade;

import com.patterns.base.BikeInterface;
import com.patterns.singleton.SerialNumberGenerator;

public class Registration {
    private BikeInterface bike;

    public Registration(BikeInterface bike) {
        this.bike = bike;
    }

    public void allocatingBikeNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("Allocating Bike Number " + generator.getNextSerial());
    }
}
