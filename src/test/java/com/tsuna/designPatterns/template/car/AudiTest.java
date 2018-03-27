/*
 * Copyright (c) 2018.
 * Project : kata
 * File : AudiTest.java
 * Date : 18-3-27 下午12:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.template.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AudiTest {
    private Audi audi;

    @Before
    public void instantiate() {
        audi = new Audi();
    }

    @Test
    public void show() {
        String expected = "Audi starts\n" +
                "Audi alarms\n" +
                "Audi's engine booms\n" +
                "Audi stops\n";
        Assert.assertEquals(expected, audi.show());
    }
}