package com.patterns.base;

import com.patterns.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    void paint(BikeColor color);
}