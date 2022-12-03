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
import com.patterns.iterator.MountainBikeRange;
import com.patterns.iterator.RoadBikeRange;
import com.patterns.observer.GearBox;
import com.patterns.observer.SpeedMonitor;
import com.patterns.observer.Speedometer;
import com.patterns.observerv2.BikeGearBox;
import com.patterns.observerv2.BikeSpeedMonitor;
import com.patterns.observerv2.BikeSpeedometer;
import com.patterns.singleton.SerialNumberGenerator;
import com.patterns.visitor.WheelDiagnostics;
import com.patterns.visitor.WheelInventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //abstractFactoryExample();
        //builderExample();
        //singletonExample();
        //adapterExample();
        //decoratorExample();
        //facadeExample();
        //iteratorExample1();
        //iteratorExample2();
        //observerExample();
        //observerExampleV2();
        visitorExample();
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
        myTouringBike.paint(BikeColor.GOLD);
        System.out.println(myTouringBike);

        myTouringBike = new LeatherSeatOption(myTouringBike);
        System.out.println(myTouringBike);
    }

    static void facadeExample() {
        BikeFacade bikeFacade = new BikeFacade();
        bikeFacade.prepareForSale(new DownHill(new WideWheel(25 )));
    }

    static void iteratorExample1() {
        System.out.println("=== Our Road Bikes ===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());
        System.out.println("=== Our Mountain Bikes ===");
        MountainBikeRange mountRange = new MountainBikeRange();
        printIterator(mountRange.iterator());
    }

    static void iteratorExample2() {
        System.out.println("=== Our Road Bikes");
        RoadBikeRange bikeRange = new RoadBikeRange();
        for(BikeInterface bikes : bikeRange.getRange()) {
            System.out.println(bikes);
        }

        System.out.println("=== Mountain Bikes");
        MountainBikeRange mountainRange = new MountainBikeRange();
        for(BikeInterface bikes : mountainRange.getRange()) {
            System.out.println(bikes);
        }
    }

    static void printIterator(Iterator iter) {
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    static void observerExample() {
        SpeedMonitor monitor = new SpeedMonitor();
        Speedometer speedo = new Speedometer();
        speedo.addObserver(monitor);
        speedo.addObserver(new GearBox());

        speedo.setCurrentSpeed(5);
        speedo.setCurrentSpeed(10);
        speedo.setCurrentSpeed(20);
        speedo.setCurrentSpeed(30);
        speedo.setCurrentSpeed(35);
    }

    static void observerExampleV2() {
        BikeSpeedometer speedo = new BikeSpeedometer();
        speedo.addSpeedometerListener(new BikeSpeedMonitor());
        speedo.addSpeedometerListener(new BikeGearBox());

        speedo.setCurrentSpeed(5);
        speedo.setCurrentSpeed(10);
        speedo.setCurrentSpeed(20);
        speedo.setCurrentSpeed(30);
        speedo.setCurrentSpeed(35);
    }

    static void visitorExample() {
        WheelInterface wheel = new WideWheel(24);
        wheel.acceptVisitor(new WheelDiagnostics());
        wheel.acceptVisitor(new WheelInventory());
    }
}
