/*
 * Copyright (c) 2017.
 * Project : kata
 * File : YelloHuman.java
 * Date : 17-12-21 上午9:13
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.simpleFactory;

public class YellowHuman implements Human {
    @Override
    public String getColor() {
        return "My color is yello.";
    }

    @Override
    public String talk() {
        return "Hello.";
    }
}
