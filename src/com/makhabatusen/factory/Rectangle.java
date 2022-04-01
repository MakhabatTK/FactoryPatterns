package com.makhabatusen.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        char rectangle ='\u25AD';
        System.out.println("Rectangle: " + rectangle);
    }
}
