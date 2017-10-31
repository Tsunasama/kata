/*
 * Copyright (c) 2017.
 * Project : kata
 * File : RecommendedFactory1Test.java
 * Date : 17-10-31 下午12:41
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.singleton.singletonFactory;

import org.junit.Assert;
import org.junit.Test;

public class RecommendedFactory1Test {
    @Test
    public void testFactory() throws InterruptedException {
        //Make threee thread running concurrently
        FactoryWorkingThread workingThread1 = new FactoryWorkingThread();
        FactoryWorkingThread workingThread2 = new FactoryWorkingThread();
        FactoryWorkingThread workingThread3 = new FactoryWorkingThread();
        workingThread1.start();
        workingThread2.start();
        workingThread3.start();
        //Waiting for completion of threads above
        Thread.sleep(100);
        Assert.assertEquals(3, RecommendedFactory1.getFactory().getCount());
        Assert.assertSame(workingThread1.getFactory(), workingThread2.getFactory());
        Assert.assertSame(workingThread1.getFactory(), workingThread3.getFactory());
    }

    private class FactoryWorkingThread extends Thread {
        private RecommendedFactory1 recommendedFactory1;

        RecommendedFactory1 getFactory() {
            return recommendedFactory1;
        }

        @Override
        public void run() {
            RecommendedFactory1 factory1 = RecommendedFactory1.getFactory();
            factory1.doDuty();
            super.run();
        }
    }
}