/*
 * Copyright (c) 2017.
 * Project : kata
 * File : WrongHuman.java
 * Date : 17-12-21 上午9:23
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.simpleFactory;

public class WrongHuman implements Human {
    @Override
    public String getColor() {
        return "I'm wrong human , I don't have color ";
    }

    @Override
    public String talk() {
        return "I'm wrong human , I cannot talk";
    }
}
