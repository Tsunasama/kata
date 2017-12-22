/*
 * Copyright (c) 2017.
 * Project : kata
 * File : MaleYellowHuman.java
 * Date : 17-12-22 上午11:30
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public String getSex() {
        return "I'm male";
    }
}
