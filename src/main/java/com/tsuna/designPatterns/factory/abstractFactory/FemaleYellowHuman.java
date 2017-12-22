/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FemaleYellowHuman.java
 * Date : 17-12-22 上午11:30
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public String getSex() {
        return "I'm female";
    }
}
