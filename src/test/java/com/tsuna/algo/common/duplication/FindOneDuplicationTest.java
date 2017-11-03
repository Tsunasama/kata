/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FindOneDuplicationTest.java
 * Date : 17-11-3 下午7:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.duplication;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOneDuplicationTest {
    @Test
    public void testFindDuplication() throws Exception {
        int[] duplicate1 = new int[]{5, 4, 4, 3, 4, 1};
        int[] duplicate2 = new int[]{2, 3, 4, 5, 3, 2};
        Assert.assertEquals(4, FindOneDuplication.findDuplication(duplicate1));
        Assert.assertEquals(3, FindOneDuplication.findDuplication(duplicate2));
    }

    @Test(expected = RuntimeException.class)
    public void testFindDuplicationWithNullParameter() {
        FindOneDuplication.findDuplication(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        FindOneDuplication.findDuplication(new int[]{1, 2, 3});
    }

}