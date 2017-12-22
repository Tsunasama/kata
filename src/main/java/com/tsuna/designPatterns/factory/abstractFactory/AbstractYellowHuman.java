/*
 * Copyright (c) 2017.
 * Project : kata
 * File : AbstractYellowHuman.java
 * Date : 17-12-22 上午11:28
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public String getColor() {
        return "My skin is yellow.";
    }

    @Override
    public String talk() {
        return "Hello.";
    }
}
