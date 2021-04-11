package com.hello.design.pattern.facory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        Shape square = factory.getShape("square");
        circle.draw();
        square.draw();
    }
}
