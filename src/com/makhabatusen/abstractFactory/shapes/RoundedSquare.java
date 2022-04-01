package com.makhabatusen.abstractFactory.shapes;

import com.makhabatusen.abstractFactory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        char square = '\u25A2';
        System.out.println( "Rounded Square:" + square);
    }
}
