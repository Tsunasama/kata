/*
 * Copyright (c) 2017.
 * Project : kata
 * File : WhiteHuman.java
 * Date : 17-12-21 上午9:14
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.simpleFactory;

public class WhiteHuman implements Human {
    @Override
    public String getColor() {
        return "My skin is white.";
    }

    @Override
    public String talk() {
        return "What's up man.";
    }
}
