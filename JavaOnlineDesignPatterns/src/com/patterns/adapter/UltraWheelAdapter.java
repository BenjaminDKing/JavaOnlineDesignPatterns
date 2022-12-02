package com.patterns.adapter;

import com.patterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {

    public UltraWheelAdapter(UltraWheel ultraWheel) {
        super(ultraWheel.getWheelSize(), false);
    }
}
