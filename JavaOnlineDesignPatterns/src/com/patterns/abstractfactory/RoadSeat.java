package com.patterns.abstractfactory;

public class RoadSeat implements BikeSeatInterface {
    @Override
    public String getSeatParts() {
        return "Seat parts of the Road Bike";
    }
}
