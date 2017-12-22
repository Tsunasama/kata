/*
 * Copyright (c) 2017.
 * Project : kata
 * File : BlackHuman.java
 * Date : 17-12-21 下午11:51
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.singletonFactory;

public class BlackHuman implements Human {
    @Override
    public String getColor() {
        return "My skin is black.";
    }

    @Override
    public String talk() {
        return "I know bbox.";
    }

    private BlackHuman() {
    }
}
