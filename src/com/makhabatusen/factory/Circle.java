package com.makhabatusen.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        char circle = '\u25EF';
        System.out.println("Circle: " + circle);
    }

}
