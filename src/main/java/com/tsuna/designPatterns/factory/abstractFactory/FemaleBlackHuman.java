/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FemaleBlackHuman.java
 * Date : 17-12-22 上午11:32
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public String getSex() {
        return "I'm female";
    }
}
