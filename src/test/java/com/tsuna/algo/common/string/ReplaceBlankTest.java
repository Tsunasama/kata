/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ReplaceBlankTest.java
 * Date : 17-11-5 下午12:54
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceBlankTest {
    @Test
    public void testReplaceBlank() throws Exception {
        char[] array1 = "a b  ".toCharArray();
        char[] array2 = "      ".toCharArray();
        char[] array3 = " a b    ".toCharArray();
        char[] array4 = "a b cde".toCharArray();
        ReplaceBlank.replaceBlank(array1, 3);
        ReplaceBlank.replaceBlank(array2, 2);
        ReplaceBlank.replaceBlank(array3, 4);
        ReplaceBlank.replaceBlank(array4, 3);
        Assert.assertArrayEquals("a%20b".toCharArray(), array1);
        Assert.assertArrayEquals("%20%20".toCharArray(), array2);
        Assert.assertArrayEquals("%20a%20b".toCharArray(), array3);
        Assert.assertArrayEquals("a%20bde".toCharArray(), array4);
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceBlankFirstParamNull() {
        ReplaceBlank.replaceBlank(null, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceBlankSecondParamToBig() {
        ReplaceBlank.replaceBlank("abc".toCharArray(), 4);
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceBlankArrayLengthNotEnough() {
        ReplaceBlank.replaceBlank("a c ".toCharArray(), 3);
    }
}