/*
 * Copyright (c) 2017.
 * Project : kata
 * File : feasibleFactory1.java
 * Date : 17-10-31 上午11:10
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.singleton.singletonFactory;

/**
 * This facotry is just an improved edition of DefectiveFactory1
 */
final class FeasibleFactory1 {
    private static FeasibleFactory1 feasibleFactory1 = null;
    private static final Object classLocker = FeasibleFactory1.class;
    private static int count = 0;

    private FeasibleFactory1() {

    }

    static FeasibleFactory1 getFactory() {
        if (feasibleFactory1 == null) {
            synchronized (classLocker) {
                if (feasibleFactory1 == null)
                    feasibleFactory1 = new FeasibleFactory1();
                return feasibleFactory1;
            }
        }
        return feasibleFactory1;
    }

    synchronized void doDuty() {
        count++;
    }

    int getCount() {
        return count;
    }
}
