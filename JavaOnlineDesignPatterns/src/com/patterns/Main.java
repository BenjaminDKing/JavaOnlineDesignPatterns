package com.patterns;

import com.patterns.abstractfactory.AbstractBikeFactory;
import com.patterns.abstractfactory.BikeFrameInterface;
import com.patterns.abstractfactory.BikeSeatInterface;
import com.patterns.abstractfactory.RoadBikeFactory;
import com.patterns.base.BikeInterface;
import com.patterns.base.NarrowWheel;
import com.patterns.base.RoadBike;
import com.patterns.base.Touring;
import com.patterns.builder.AbstractBikeBuilder;
import com.patterns.builder.AbstractBikeDirector;
import com.patterns.builder.RoadBikeBuilder;
import com.patterns.builder.RoadBikeDirector;
import com.patterns.singleton.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        //abstractFactoryExample();
        //builderExample();
        singletonExample();
    }

    static void abstractFactoryExample() {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    }

    static void builderExample() {
        RoadBike bike = new Touring(new NarrowWheel(22));
        AbstractBikeBuilder builder = new RoadBikeBuilder(bike);
        AbstractBikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);
    }

    static void singletonExample() {
        System.out.println("Generating Serial Numbers");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("Next serial " + generator.getNextSerial());
        System.out.println("Next serial " + generator.getNextSerial());
        System.out.println("Next serial " + generator.getNextSerial());
    }
}
