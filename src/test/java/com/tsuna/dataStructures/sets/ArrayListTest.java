/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ArrayListTest.java
 * Date : 17-11-23 下午4:45
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList arrayList;

    @Before
    public void initialize() {
        arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(9);
    }

    @Test
    public void add() throws Exception {
        arrayList.add(12);
        Assert.assertEquals("[ 3, 6, 9, 12 ]", arrayList.toString());
    }

    @Test
    public void addMoreThan10Elements() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        Assert.assertEquals(20, arrayList.getInnerArrayLength());
    }

    @Test
    public void get() throws Exception {
        Assert.assertEquals(3, arrayList.get(0));
        Assert.assertEquals(6, arrayList.get(1));
        Assert.assertEquals(9, arrayList.get(2));
    }

    @Test
    public void set() throws Exception {
        int oldNum = arrayList.set(1, 10);
        Assert.assertEquals(6, oldNum);
        Assert.assertEquals(10, arrayList.get(1));
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, arrayList.size());
        arrayList.add(12);
        Assert.assertEquals(4, arrayList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithIndexOutOfBounds() {
        arrayList.get(5);
    }

}