/*
 * Copyright (c) 2017.
 * Project : kata
 * File : PrimeNumbersCollectorTest.java
 * Date : 17-11-19 下午9:35
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimeNumbersCollectorTest {
    @Test
    public void getPrimes() throws Exception {
        List<Integer> result = new PrimeNumbersCollector().getPrimes(25);
        Assert.assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23]", result.toString());
    }

    @Test(timeout = 1500)
    public void testGetPrimesUnder3Million() {
        new PrimeNumbersCollector().getPrimes(1000000);
    }
}