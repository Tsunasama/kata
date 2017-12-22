/*
 * Copyright (c) 2017.
 * Project : kata
 * File : HumanFactory.java
 * Date : 17-12-21 上午9:21
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.simpleFactory;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            human = new WrongHuman();
        }
        return (T) human;
    }
}
