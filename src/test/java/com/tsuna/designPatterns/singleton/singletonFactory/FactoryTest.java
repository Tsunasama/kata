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
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        Thread t3=new Thread(p3);
        //Make threee thread running concurrently
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(100);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        Assert.assertEquals(3, Factory.getFactory().getCounts());
        Assert.assertSame(p1.getFactory(),p2.getFactory());
        Assert.assertSame(p1.getFactory(),p3.getFactory());
    }

    class Processing implements Runnable {
        private Factory factory;

        Factory getFactory() {
            return factory;
        }

        public void run() {
            this.factory = Factory.getFactory();
            factory.duDuty();
        }
    }
}