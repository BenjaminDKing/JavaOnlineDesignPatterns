package com.patterns.observerv2;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {
    private int speed;

    public SpeedometerEvent(Object source, int speed) {
        super(source);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
