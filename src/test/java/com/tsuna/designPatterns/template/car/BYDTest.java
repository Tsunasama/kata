/*
 * Copyright (c) 2018.
 * Project : kata
 * File : BYDTest.java
 * Date : 18-3-27 下午12:56
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.template.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BYDTest {
    private BYD byd;

    @Before
    public void instantiate() {
        byd = new BYD();
    }

    @Test
    public void show() {
        String expected = "BYD starts\n" +
                "BYD alarms\n" +
                "BYD's engine booms\n" +
                "BYD stops\n";
        Assert.assertEquals(expected, byd.show());
    }
}