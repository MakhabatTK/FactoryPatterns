package com.makhabatusen.abstractFactory;

import com.makhabatusen.abstractFactory.factory.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {


        // Simple Shapes
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("rectangle").draw();

        // Rounded Shapes
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        roundedShapeFactory.getShape("square").draw();
        roundedShapeFactory.getShape("rectangle").draw();



    }
}
