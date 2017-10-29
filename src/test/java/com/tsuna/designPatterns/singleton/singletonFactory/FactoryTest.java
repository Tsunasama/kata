package com.tsuna.designPatterns.singleton.singletonFactory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {
    @Test
    public void testFactory() {
        Processing p1 = new Processing();
        Processing p2 = new Processing();
        Processing p3 = new Processing();
        p1.run();
        p2.run();
        p3.run();
        Assert.assertEquals(3, Factory.getFactory().getCounts());
    }

    class Processing implements Runnable {
        public void run() {
            Factory factory = Factory.getFactory();
            factory.duDuty();
        }
    }
}