package com.hello.design.pattern.facory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Shape circle = factory.getShapeFactory("circle");
        Shape square = factory.getShapeFactory("square");
        circle.draw();
        square.draw();
    }
}
