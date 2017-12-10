/*
 * Copyright (c) 2017.
 * Project : kata
 * File : LCSTest.java
 * Date : 17-12-10 上午10:42
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.DP.LCS;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCSTest {
    private char[] seq1 = "a34p4t234tx-43fds8fds6fsdf9".toCharArray();
    private char[] seq2 = "a656p989t87698xre-4rec58546iuu945".toCharArray();
    private LCS ques;

    @Before
    public void instantiate() {
        ques = new LCS(seq1, seq2);
        ques.solveAll();
    }

    @Test
    public void testGetSolution() throws Exception {
        LCSElement result = ques.getSolution();
        Assert.assertEquals(9, result.getMatching());
        Assert.assertEquals("[a, p, t, x, -, 4, 8, 6, 9]", result.getEles().toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSolutionWithArgOutOfIndexException() {
        ques.getSolution(seq1.length, seq2.length + 1);
    }

    @Test(expected = RuntimeException.class)
    public void testGetSolutionWithArgLessThan0() {
        ques.getSolution(-1, 1);
    }

    @Test
    public void testGetSolutinoWithSeveralArg() {
        LCSElement result = ques.getSolution(10, 20);
        Assert.assertEquals("[a, p, t, 4]", result.getEles().toString());
    }
}