package com.hello.design.pattern.facory;

public class SimpleFactory {

    Shape getShapeFactory(String shapeName){
        if("circle".equals(shapeName)){
            return new Circle();
        }else if("square".equals(shapeName)){
            return new Square();
        }
        return null;
    }

}
