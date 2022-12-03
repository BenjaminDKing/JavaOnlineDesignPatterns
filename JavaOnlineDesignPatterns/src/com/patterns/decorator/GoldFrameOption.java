package com.patterns.decorator;

import com.patterns.BikeColor;
import com.patterns.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption {

    public GoldFrameOption(BikeInterface bike) {
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 300.00f;
    }

    @Override
    public void paint(BikeColor color) {
        super.paint(BikeColor.GOLD);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + getWheel() + ", GOLD FRAME, price = " + getPrice() + ")";
    }
}
