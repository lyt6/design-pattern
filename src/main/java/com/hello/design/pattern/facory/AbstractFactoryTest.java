package com.hello.design.pattern.facory;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        FactoryProducer producer = new FactoryProducer();

        AbstractFactory shapeFactory = producer.getFactory("shape");
        AbstractFactory colorFactory = producer.getFactory("color");

        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");

        Color red = colorFactory.getColor("red");
        Color black = colorFactory.getColor("black");

        circle.draw();
        square.draw();

        red.fill();
        black.fill();

    }
}
