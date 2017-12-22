/*
 * Copyright (c) 2017.
 * Project : kata
 * File : MaleBlackHuman.java
 * Date : 17-12-22 上午11:33
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public String getSex() {
        return "I'm male";
    }
}
