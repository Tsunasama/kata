/*
 * Copyright (c) 2017.
 * Project : kata
 * File : RecommendedFactory2Test.java
 * Date : 17-10-31 下午7:41
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.singleton.singletonFactory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecommendedFactory2Test {
    @Test
    public void testFactory() throws InterruptedException {
        //Make threee thread running concurrently
        FactoryWorkingThread thread1 = new FactoryWorkingThread();
        FactoryWorkingThread thread2 = new FactoryWorkingThread();
        FactoryWorkingThread thread3 = new FactoryWorkingThread();
        thread1.start();
        thread2.start();
        thread3.start();
        //Waiting for completion of threads above
        Thread.sleep(100);
        Assert.assertEquals(3, RecommendedFactory2.getFactory().getCount());
        Assert.assertSame(thread1.getFactory(), thread2.getFactory());
        Assert.assertSame(thread1.getFactory(), thread2.getFactory());
    }

    private class FactoryWorkingThread extends Thread {
        private RecommendedFactory2 recommendedFactory2;

        RecommendedFactory2 getFactory() {
            return recommendedFactory2;
        }

        @Override
        public void run() {
            RecommendedFactory2 factory = RecommendedFactory2.getFactory();
            factory.doDuty();
            super.run();
        }
    }
}