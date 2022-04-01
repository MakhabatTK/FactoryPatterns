package com.makhabatusen.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getsShape("circle");
        Shape square = shapeFactory.getsShape("square");
        Shape rectangle = shapeFactory.getsShape("rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();


    }
}
