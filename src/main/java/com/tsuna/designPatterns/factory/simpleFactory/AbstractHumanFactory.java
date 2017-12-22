/*
 * Copyright (c) 2017.
 * Project : kata
 * File : AbstractHumanFactory.java
 * Date : 17-12-21 上午9:19
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.simpleFactory;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
