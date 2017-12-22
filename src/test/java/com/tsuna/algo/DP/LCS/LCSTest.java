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

public class LCSTest {
    private char[] seq1 = "a34p4t234tx-43fds8fds6fsdf9".toCharArray();
    private char[] seq2 = "a656p989t87698xre-4rec58546iuu945".toCharArray();
    private char[] seq3 = "".toCharArray();
    private char[] seq4 = ("hxciuhdufghlauglshfulgaskldgfyuegrlgsdafkljagsdfygasiudfosdaugfksadjgfa" +
            "flkahufhsdafukhakldhflksadhfugewalfbkasljdvkxczljgvyjgiawgfibclkjgralueghlaw").toCharArray();
    private char[] seq5 = ("fhksadfj;sadvh;hvuilahefdsgfjlasgfdlkashdolfuasldfblsakdhflsfhsakvhslakvdlksd" +
            "usfahlucvxzhvuigclvkgywbaffvlgxvucziviulzxvhiouxczgvlgralvzjvgzuxgvyxcgzcvu").toCharArray();
    private LCS ques1;
    private LCS ques2;
    private LCS ques3;
    private LCS ques4;

    @Before
    public void instantiate() {
        ques1 = new LCS(seq1, seq2);
        ques2 = new LCS(seq1, seq3);
        ques3 = new LCS(seq3, seq3);
        ques4 = new LCS(seq4, seq5);
        ques1.solveAll();
        ques2.solveAll();
        ques3.solveAll();
        ques4.solveAll();
    }

    @Test
    public void test() {
        char[] seq4 = ("hxciuhdufghlauglshfulgaskldgfyuegrlgsdafkljagsdfygasiudfosdaugfksadjgfa" +
                "flkahufhsdafukhakldhflksadhfugewalfbkasljdvkxczljgvyjgiawgfibclkjgralueghlaw").toCharArray();
        char[] seq5 = ("fhksadfj;sadvh;hvuilahefdsgfjlasgfdlkashdolfuasldfblsakdhflsfhsakvhslakvdlksd" +
                "usfahlucvxzhvuigclvkgywbaffvlgxvucziviulzxvhiouxczgvlgralvzjvgzuxgvyxcgzcvu").toCharArray();
        LCS ques = new LCS(seq4, seq5);
        ques.solveAll();
    }

    @Test
    public void testGetSolution() throws Exception {
        Assert.assertEquals(9, ques1.getSolution().getMatching());
        Assert.assertEquals("[a, p, t, x, -, 4, 8, 6, 9]", ques1.getSolution().getEles().toString());
        Assert.assertEquals("[]", ques2.getSolution().getEles().toString());
        Assert.assertEquals("[]", ques3.getSolution().getEles().toString());
        Assert.assertEquals("[f, h, a, s, h, u, l, a, d, g, f, l, a, f, l, a, s, d, " +
                "f, a, s, d, f, s, a, k, d, f, l, f, h, s, a, k, h, a, k, d, l, k, s, d, u," +
                " f, a, l, v, x, z, g, v, g, w, f, i, c, l, g, r, a, l, u, g]", ques4.getSolution().getEles().toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSolutionWithArgOutOfIndexException() {
        ques1.getSolution(seq1.length, seq2.length + 1);
    }

    @Test(expected = RuntimeException.class)
    public void testGetSolutionWithArgLessThan0() {
        ques1.getSolution(-1, 1);
    }

    @Test
    public void testGetSolutinoWithSeveralArg() {
        LCSElement result = ques1.getSolution(10, 20);
        Assert.assertEquals("[a, p, t, 4]", result.getEles().toString());
    }
}