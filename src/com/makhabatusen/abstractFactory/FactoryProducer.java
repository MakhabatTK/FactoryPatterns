package com.makhabatusen.abstractFactory;

import com.makhabatusen.abstractFactory.factory.AbstractFactory;
import com.makhabatusen.abstractFactory.factory.RoundedShapeFactory;
import com.makhabatusen.abstractFactory.factory.ShapeFactory;

public  class FactoryProducer {

    public static AbstractFactory getFactory(boolean isRounded) {
        if (isRounded)
            return new RoundedShapeFactory();
        else return new ShapeFactory();

    }
}
