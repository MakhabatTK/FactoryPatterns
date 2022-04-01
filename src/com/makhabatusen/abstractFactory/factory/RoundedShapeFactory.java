package com.makhabatusen.abstractFactory.factory;

import com.makhabatusen.abstractFactory.Shape;
import com.makhabatusen.abstractFactory.shapes.RoundedRectangle;
import com.makhabatusen.abstractFactory.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {

        try {
            switch (shape) {
                case "square":
                    return new RoundedSquare();
                case "rectangle":
                    return new RoundedRectangle();
                default:
                    return null;
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
