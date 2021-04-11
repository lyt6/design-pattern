package com.hello.design.pattern.facory;

public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String shapeName){
        if("circle".equals(shapeName)){
            return new Circle();
        }else if("square".equals(shapeName)){
            return new Square();
        }
        return null;
    }

    public Color getColor(String colorName) {
        return null;
    }

}
