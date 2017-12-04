/*
 * Copyright (c) 2017.
 * Project : kata
 * File : GiveChangesTest.java
 * Date : 17-12-4 下午10:19
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.DP.giveChanges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiveChangesTest {
    private GiveChanges context;

    @Before
    public void initialize() {
        context = new GiveChanges();
    }

    @Test
    public void testGetSolution() {
        Assert.assertEquals(4, context.getSolution(10));
        Assert.assertEquals(13, context.getSolution(26));
    }

    @Test
    public void testGetSolutionWithErrorParam() {
        Assert.assertEquals(-1, context.getSolution(0));
    }

}