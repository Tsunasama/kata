/*
 * Copyright (c) 2017.
 * Project : kata
 * File : YellowHuman.java
 * Date : 17-12-21 下午11:51
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.singletonFactory;

public class YellowHuman implements Human {
    @Override
    public String getColor() {
        return "My skin is yellow.";
    }

    @Override
    public String talk() {
        return "Hello.";
    }

    private YellowHuman() {
    }
}
