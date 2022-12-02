package com.patterns.decorator;

import com.patterns.base.AbstractBike;
import com.patterns.base.BikeInterface;

public abstract class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratedBike;

    // FROM CLASS
//    public AbstractBikeOption(BikeInterface bike) {
//        super(bike.getWheel());
//        this.decoratedBike = bike;
//    }

    // TEST
    public AbstractBikeOption(BikeInterface bike) {
        super(bike.getWheel(), bike.getColor());
        this.decoratedBike = bike;
    }
}
