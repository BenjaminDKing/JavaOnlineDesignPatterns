package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {


    @Override
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer)obs;
        if(speedo.getCurrentSpeed() > 30) {
            System.out.println("*** ALERT *** Riding too fast! (" + speedo.getCurrentSpeed() + ")");
        } else {
            System.out.println("... nice and steady ... (" + speedo.getCurrentSpeed() + ")");
        }
    }
}
