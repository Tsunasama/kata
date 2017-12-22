/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FemaleFactory.java
 * Date : 17-12-22 上午11:37
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
