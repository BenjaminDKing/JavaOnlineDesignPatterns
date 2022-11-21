package com.patterns.base;

public abstract class AbstractWheel implements WheelInterface {

    private int size;
    private boolean wide;

    public AbstractWheel(int size, boolean isWide) {
        this.size = size;
        this.wide = isWide;
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
    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
    }

} // End class
