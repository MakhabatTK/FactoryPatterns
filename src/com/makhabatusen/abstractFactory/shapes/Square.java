package com.makhabatusen.abstractFactory.shapes;

import com.makhabatusen.abstractFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        char square = '\u25A1';
        System.out.println("Square: " + square);
    }
}
