/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FibonacciTest.java
 * Date : 17-11-12 上午10:13
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void getFiboWithLambda() throws Exception {
        Integer[] result = Fibonacci.getFiboWithLambda(20);
        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(expected[i], result[i].intValue());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFiboWithWrongParameter() {
        Fibonacci.getFiboWithLambda(0);
    }

    @Test
    public void testFind() {
        Assert.assertEquals(55, Fibonacci.find(11));
        Assert.assertEquals(1, Fibonacci.find(3));
    }
}