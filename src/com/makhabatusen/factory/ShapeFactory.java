package com.makhabatusen.factory;

public class ShapeFactory {

    public Shape getsShape(String shape) {
        try {
            switch (shape) {
                case "circle":
                    return new Circle();
                case "square":
                    return new Square();
                case "rectangle":
                    return new Rectangle();
                default:
                    return null;
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
