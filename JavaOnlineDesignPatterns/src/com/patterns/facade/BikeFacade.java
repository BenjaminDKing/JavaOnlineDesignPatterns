package com.patterns.facade;

import com.patterns.base.BikeInterface;

public class BikeFacade {
    public void prepareForSale(BikeInterface bike) {
        Registration register = new Registration(bike);
        register.allocatingBikeNumber();
        Documentation.printBrochure(bike);

        bike.cleanFrame();
        bike.airTires();
        bike.testRide();
    }
}
