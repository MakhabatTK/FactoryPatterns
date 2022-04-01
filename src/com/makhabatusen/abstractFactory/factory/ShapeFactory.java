package com.makhabatusen.abstractFactory.factory;

import com.makhabatusen.abstractFactory.Shape;
import com.makhabatusen.abstractFactory.shapes.Rectangle;
import com.makhabatusen.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        try {
            switch (shape) {
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
