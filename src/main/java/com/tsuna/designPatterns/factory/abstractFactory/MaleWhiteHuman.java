/*
 * Copyright (c) 2017.
 * Project : kata
 * File : MaleWhiteHuman.java
 * Date : 17-12-22 上午11:32
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public String getSex() {
        return "I'm male";
    }
}
