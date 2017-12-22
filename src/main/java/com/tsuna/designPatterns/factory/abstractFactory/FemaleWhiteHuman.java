/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FemaleWhiteHuman.java
 * Date : 17-12-22 上午11:31
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public String getSex() {
        return "I'm female";
    }
}
