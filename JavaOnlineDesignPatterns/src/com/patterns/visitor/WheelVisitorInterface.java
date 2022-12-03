package com.patterns.visitor;

import com.patterns.base.WheelInterface;

public interface WheelVisitorInterface {
    void visit(WheelInterface wheel);
    void visit(Spokes spokes);
    void visit(Bearings bearings);
}
