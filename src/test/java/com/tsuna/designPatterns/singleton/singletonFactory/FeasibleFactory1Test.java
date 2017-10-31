/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FeasibleFactory1Test.java
 * Date : 17-10-31 上午11:17
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.singleton.singletonFactory;

import org.junit.Assert;
import org.junit.Test;

public class FeasibleFactory1Test {
    @Test
    public void factoryTest() throws InterruptedException {
        //Make threee thread running concurrently
        FactoryWorkingThread workingThread1 = new FactoryWorkingThread();
        FactoryWorkingThread workingThread2 = new FactoryWorkingThread();
        FactoryWorkingThread workingThread3 = new FactoryWorkingThread();
        workingThread1.start();
        workingThread2.start();
        workingThread3.start();
        //Waiting for completion of threads above
        Thread.sleep(100);
        Assert.assertEquals(3, FeasibleFactory1.getFactory().getCount());
        Assert.assertSame(workingThread1.getFactory(), workingThread2.getFactory());
        Assert.assertSame(workingThread1.getFactory(), workingThread3.getFactory());
    }

    private class FactoryWorkingThread extends Thread {
        private FeasibleFactory1 feasibleFactory1;

        FeasibleFactory1 getFactory() {
            return feasibleFactory1;
        }

        @Override
        public void run() {
            FeasibleFactory1 factory1 = FeasibleFactory1.getFactory();
            factory1.doDuty();
            super.run();
        }
    }
}