/*
 * Copyright (c) 2017.
 * Project : kata
 * File : StackTest.java
 * Date : 17-11-23 下午9:21
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @Before
    public void initialize() {
        stack = new Stack(5);
        stack.push(0);
        stack.push(6);
        stack.push(12);
        stack.push(18);
    }

    @Test
    public void push() throws Exception {
        stack.push(24);
        Assert.assertEquals("from top to bottom: [ 24, 18, 12, 6, 0 ]", stack.toString());
    }

    @Test
    public void testExpandingCapacity() {
        stack.push(24);
        stack.push(32);
        Assert.assertEquals(6, stack.size());
    }

    @Test
    public void peek() throws Exception {
        Assert.assertEquals(18, stack.peek());
    }

    @Test
    public void pop() throws Exception {
        int item = stack.pop();
        Assert.assertEquals(18, item);
        Assert.assertEquals(12, stack.peek());
    }

    @Test
    public void isFull() throws Exception {
        Assert.assertEquals(false, stack.isFull());
        stack.push(24);
        Assert.assertEquals(true, stack.isFull());
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(false, stack.isEmpty());
        for (int i = 1; i < 5; i++)
            stack.pop();
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(4, stack.size());
    }
}