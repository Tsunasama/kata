/*
 * Copyright (c) 2017.
 * Project : kata
 * File : RecommendedFactory2.java
 * Date : 17-10-31 下午1:01
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.singleton.singletonFactory;

/**
 * This singleton factory using the instance created by VM when it initial 'Nested' class.
 * (And therefore,this factory overcome the shortage of 'RecommendedFactory1' that you cannot
 * control the time when to instantiate an instance,but oppositely,the code looks not elegant)
 */
class RecommendedFactory2 {
    private RecommendedFactory2() {
    }

    private static int count;

    int getCount() {
        return count;
    }

    synchronized void doDuty() {
        count++;
    }

    static RecommendedFactory2 getFactory() {
        return NestedFactoryContainer.recommendedFactory2;
    }

    private static class NestedFactoryContainer {
        static final RecommendedFactory2 recommendedFactory2 = new RecommendedFactory2();
    }
}
