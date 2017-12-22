/*
 * Copyright (c) 2017.
 * Project : kata
 * File : AbstractBlackHuman.java
 * Date : 17-12-22 上午11:26
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public String getColor() {
        return "My skin is black.";
    }

    @Override
    public String talk() {
        return "I know bbox.";
    }
}
