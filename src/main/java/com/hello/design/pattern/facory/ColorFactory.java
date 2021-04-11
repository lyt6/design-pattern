package com.hello.design.pattern.facory;

public class ColorFactory extends AbstractFactory{

   public Shape getShape(String shapeName) {
        return null;
    }

   public Color getColor(String colorName){
        if("red".equals(colorName)){
            return new Red();
        }else if("black".equals(colorName)){
            return new Black();
        }
        return null;
    }

}
