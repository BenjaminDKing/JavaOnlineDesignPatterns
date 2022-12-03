package com.patterns.observerv2;

public class BikeSpeedMonitor implements SpeedometerListener {

    @Override
    public void speedChange(SpeedometerEvent event) {
        if(event.getSpeed() > 30) {
            System.out.println("*** ALERT *** Riding too fast! (" + event.getSpeed() + ")");
        } else {
            System.out.println("... Nice and steady ... (" + event.getSpeed() + ")");
        }
    }
}