/*
 * Copyright (c) 2017.
 * Project : kata
 * File : findDuplacationInArrayTest.java
 * Date : 17-11-2 上午10:08
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.duplication;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicationInArrayTest {
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private int[] wrongArray;
    @Before
    public void initialize(){
        array1=new int[]{3,6,7,2,5,1,0,4};
        array2=new int[]{6,4,3,2,6,2,1,7};
        array3=new int[]{3,2,4,4,7,2,4,4};
        wrongArray=new int[]{1,2,4,7,8,3,2,4};
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNotAllowedArgument(){
        FindDuplicationInArray.findDuplacate(wrongArray);
    }

    @Test
    public void testFindDuplication(){
        List<Integer> result1= FindDuplicationInArray.findDuplacate(array1);
        List<Integer> result2= FindDuplicationInArray.findDuplacate(array2);
        List<Integer> result3=FindDuplicationInArray.findDuplacate(array3);
        Assert.assertArrayEquals(new Integer[]{},result1.toArray());
        Assert.assertArrayEquals(new Integer[]{2,6},result2.toArray());
        Assert.assertArrayEquals(new Integer[]{2,4},result3.toArray());
    }
}