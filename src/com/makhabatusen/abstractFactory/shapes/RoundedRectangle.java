package com.makhabatusen.abstractFactory.shapes;

import com.makhabatusen.abstractFactory.Shape;

public class RoundedRectangle  implements Shape {
    @Override
    public void draw() {
        char rectangle ='\u25AD';
        System.out.println("Rounded Rectangle: " + rectangle);
    }
}
