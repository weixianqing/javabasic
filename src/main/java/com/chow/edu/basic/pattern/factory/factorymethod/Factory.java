package com.chow.edu.basic.pattern.factory.factorymethod;

import com.chow.edu.basic.pattern.factory.simplefactory.Fruit;

/**
 * Created by shelvin on 2015/11/29 15:27.
 */

public interface Factory
{
    /**
     * create fruit object by factory method
     * @return fruit object
     */
    Fruit factory();
}
