package com.hello.design.pattern.facory;

public class FactoryProducer {

    AbstractFactory getFactory(String factoryName){
        if("shape".equals(factoryName)){
            return new ShapeFactory();
        }else if ("color".equals(factoryName)){
            return new ColorFactory();
        }
        return null;
    }

}
