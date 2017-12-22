/*
 * Copyright (c) 2017.
 * Project : kata
 * File : HumanFactory.java
 * Date : 17-12-22 上午11:35
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public interface HumanFactory {
    Human createWhiteHuman();

    Human createBlackHuman();

    Human createYellowHuman();
}
