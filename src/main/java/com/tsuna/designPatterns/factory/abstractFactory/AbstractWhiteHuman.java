/*
 * Copyright (c) 2017.
 * Project : kata
 * File : AbstractWhiteHuman.java
 * Date : 17-12-22 上午11:25
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public String getColor() {
        return "My skin is white.";
    }

    @Override
    public String talk() {
        return "What's up man.";
    }
}
