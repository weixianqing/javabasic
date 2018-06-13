package com.chow.edu.basic.pattern.factory.factorymethod;

import com.shelvin.study.java.pattern.factory.simplefactory.Fruit;
import com.shelvin.study.java.pattern.factory.simplefactory.Grape;

/**
 * Created by shelvin on 2015/11/29 15:30.
 */
public class GrapeFactory implements Factory
{
    @Override
    public Fruit factory()
    {
        return new Grape();
    }
}
