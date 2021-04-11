package com.hello.design.pattern.facory;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeName);
    public abstract Color getColor(String colorName);
}
