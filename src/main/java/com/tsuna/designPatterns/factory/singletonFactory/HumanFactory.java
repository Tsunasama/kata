/*
 * Copyright (c) 2017.
 * Project : kata
 * File : HumanFactory.java
 * Date : 17-12-21 下午11:52
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.singletonFactory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

class HumanFactory {
    private static final Map<Class<? extends Human>, Human> humans = new HashMap<>();

    static synchronized <T extends Human> T createHuman(Class<T> h) {
        if (humans.containsKey(h))
            return (T) humans.get(h);
        else {
            try {
                Constructor constructor = Class.forName(h.getName()).getDeclaredConstructor();
                constructor.setAccessible(true);
                T human = (T) constructor.newInstance();
                humans.put(h, human);
                return human;

            } catch (Exception e) {
                throw new RuntimeException("cannot find the initiable class in HumanFactory.");
            }
        }
    }
}
