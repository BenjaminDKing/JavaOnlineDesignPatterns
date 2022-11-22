package com.patterns.builder;

import com.patterns.base.BikeInterface;

public abstract class AbstractBikeBuilder {
    abstract BikeInterface getBike();
    public void buildStreetTires() { }
    public void buildWideTires() { }
    public void buildHandleBars() { }
}
