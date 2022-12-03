package com.patterns.iterator;

import com.patterns.base.BikeInterface;
import com.patterns.base.NarrowWheel;
import com.patterns.base.Touring;
import com.patterns.base.Vintage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoadBikeRange implements Iterable<BikeInterface> {
    private List<BikeInterface> bikes;

    public RoadBikeRange() {
        bikes = new ArrayList<BikeInterface>();

        bikes.add(new Touring(new NarrowWheel(22)));
        bikes.add(new Touring(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(26)));
        bikes.add(new Vintage(new NarrowWheel(24)));
        bikes.add(new Vintage(new NarrowWheel(22)));
    }

    public List<BikeInterface> getRange() {
        return bikes;
    }

    @Override
    public Iterator<BikeInterface> iterator() {
        return bikes.listIterator();
    }
}
