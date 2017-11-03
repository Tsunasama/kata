/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FindIn2DArrayTest.java
 * Date : 17-11-3 下午9:04
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.searchIn2DArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindIn2DArrayTest {
    @Test
    public void findNum() {
        int[][] array1 = {{1, 2, 4, 8}};
        int[][] array2 = {{1}, {3}, {5}, {8}};
        int[][] array3 = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13}
        };
        Assert.assertTrue(FindIn2DArray.findNum(array1, 8));
        Assert.assertTrue(FindIn2DArray.findNum(array1, 1));
        Assert.assertFalse(FindIn2DArray.findNum(array1, 3));
        Assert.assertTrue(FindIn2DArray.findNum(array2, 1));
        Assert.assertTrue(FindIn2DArray.findNum(array2, 8));
        Assert.assertFalse(FindIn2DArray.findNum(array2, 4));
        Assert.assertTrue(FindIn2DArray.findNum(array3, 9));
        Assert.assertTrue(FindIn2DArray.findNum(array3, 2));
        Assert.assertTrue(FindIn2DArray.findNum(array3, 13));
        Assert.assertTrue(FindIn2DArray.findNum(array3, 4));
        Assert.assertFalse(FindIn2DArray.findNum(array3, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        int[][] array = null;
        FindIn2DArray.findNum(null, 0);
    }

}