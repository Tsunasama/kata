/*
 * Copyright (c) 2017.
 * Project : kata
 * File : SubsetTest.java
 * Date : 17-11-21 下午4:44
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.recursion.subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubsetTest {
    @Test
    public void subsets() throws Exception {
        List<List<Integer>> result = Subset.subsets(Arrays.asList(2, 5, 7, 8));
        Assert.assertEquals(
                "[[], [8], [7], [7, 8], [5], [5, 8], [5, 7], [5, 7, 8], [2], [2, 8], [2, 7], [2, 7, 8], [2, 5], [2, 5, 8], [2, 5, 7], [2, 5, 7, 8]]",
                result.toString());
    }

}