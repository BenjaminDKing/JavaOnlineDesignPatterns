package com.patterns.observer;

import java.util.Observable;

public class Speedometer extends Observable {
    private int currentSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;

        setChanged();
        notifyObservers();
    }

    public Speedometer() {
        currentSpeed = 0;
    }
}
