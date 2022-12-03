package com.patterns.base;

import com.patterns.visitor.Bearings;
import com.patterns.visitor.Spokes;
import com.patterns.visitor.WheelVisitorInterface;

public abstract class AbstractWheel implements WheelInterface {

    private int size;
    private boolean wide;

    private Spokes spokes;
    private Bearings bearings;

    public AbstractWheel(int size, boolean isWide) {
        this.size = size;
        this.wide = isWide;

        spokes = new Spokes();
        bearings = new Bearings();
    } // End constructor

    @Override
    public int getSize() {
        return size;
    } // End property getSize

    @Override
    public boolean isWide() {
        return wide;
    } // End property isWide

    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
    }

} // End class
