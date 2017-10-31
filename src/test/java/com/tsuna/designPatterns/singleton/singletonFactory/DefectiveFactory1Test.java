package com.tsuna.designPatterns.singleton.singletonFactory;

import org.junit.Assert;
import org.junit.Test;

public class DefectiveFactory1Test {
    @Test
    public void testFactory() throws InterruptedException {
        Processing p1 = new Processing();
        Processing p2 = new Processing();
        Processing p3 = new Processing();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        //Make threee thread running concurrently
        t1.start();
        t2.start();
        t3.start();
        //Waiting for completion of threads above
        Thread.sleep(100);
        Assert.assertEquals(3, DefectiveFactory1.getDefectiveFactory1().getCounts());
        Assert.assertSame(p1.getDefectiveFactory1(), p2.getDefectiveFactory1());
        Assert.assertSame(p1.getDefectiveFactory1(), p3.getDefectiveFactory1());
    }

    class Processing implements Runnable {
        private DefectiveFactory1 defectiveFactory1;

        DefectiveFactory1 getDefectiveFactory1() {
            return defectiveFactory1;
        }

        public void run() {
            this.defectiveFactory1 = DefectiveFactory1.getDefectiveFactory1();
            defectiveFactory1.duDuty();
        }
    }
}