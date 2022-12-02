package com.patterns;

import com.patterns.abstractfactory.AbstractBikeFactory;
import com.patterns.abstractfactory.BikeFrameInterface;
import com.patterns.abstractfactory.BikeSeatInterface;
import com.patterns.abstractfactory.RoadBikeFactory;
import com.patterns.adapter.UltraWheel;
import com.patterns.adapter.UltraWheelAdapter;
import com.patterns.base.*;
import com.patterns.builder.AbstractBikeBuilder;
import com.patterns.builder.AbstractBikeDirector;
import com.patterns.builder.RoadBikeBuilder;
import com.patterns.builder.RoadBikeDirector;
import com.patterns.decorator.GoldFrameOption;
import com.patterns.decorator.LeatherSeatOption;
import com.patterns.facade.BikeFacade;
import com.patterns.singleton.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //abstractFactoryExample();
        //builderExample();
        //singletonExample();
        //adapterExample();
        //decoratorExample();
        facadeExample();
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

    static void adapterExample() {
        UltraWheel ultraWheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<WheelInterface>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdapter(ultraWheel));

        for (WheelInterface wheel : wheels) {
            System.out.println(wheel);
        }
    }

    static void decoratorExample() {
        BikeInterface myTouringBike = new Touring(new NarrowWheel(24));
        System.out.println(myTouringBike);

        myTouringBike = new GoldFrameOption(myTouringBike);
        System.out.println(myTouringBike);

        myTouringBike = new LeatherSeatOption(myTouringBike);
        System.out.println(myTouringBike);
    }

    static void facadeExample() {
        BikeFacade bikeFacade = new BikeFacade();
        bikeFacade.prepareForSale(new DownHill(new WideWheel(25 )));
    }
}
