package com.patterns.base;

import com.patterns.visitor.VisitableInterface;

public interface WheelInterface extends VisitableInterface {
    int getSize();
    boolean isWide();
}
