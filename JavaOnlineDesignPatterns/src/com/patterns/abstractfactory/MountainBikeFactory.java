package com.patterns.abstractfactory;

public class MountainBikeFactory extends AbstractBikeFactory {
    @Override
    public BikeSeatInterface createSeat() {
        return new MountainSeat();
    }

    @Override
    public BikeFrameInterface createFrame() {
        return new MountainFrame();
    }
}
