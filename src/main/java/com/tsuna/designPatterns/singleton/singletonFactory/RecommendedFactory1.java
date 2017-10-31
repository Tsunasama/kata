/*
 * Copyright (c) 2017.
 * Project : kata
 * File : recommendedFactory1.java
 * Date : 17-10-31 下午12:28
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.singleton.singletonFactory;

/**
 * This implementation of singleton factory using the singleton instance created by VM on the 'initialization' step
 */
final class RecommendedFactory1 {
    private static RecommendedFactory1 recommendedFactory1 = new RecommendedFactory1();
    private static int count = 0;

    private RecommendedFactory1() {
    }

    static RecommendedFactory1 getFactory() {
        return recommendedFactory1;
    }

    synchronized void doDuty() {
        count++;
    }

    int getCount() {
        return count;
    }
}