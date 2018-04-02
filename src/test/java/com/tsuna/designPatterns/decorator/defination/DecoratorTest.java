/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ConcretComponentTest.java
 * Date : 18-4-2 下午1:03
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.decorator.defination;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
    private Component concretComponent;

    @Before
    public void instantiate() {
        concretComponent = new ConcretComponent();
    }

    @Test
    public void testDecoratorA() {
        concretComponent = new DecoratorA(concretComponent);
        String expected = "Do decorate operation in decorator A\n" +
                "Do operation in concret component.\n";
        Assert.assertEquals(concretComponent.operate(), expected);
    }

    @Test
    public void testDecoratorB() {
        concretComponent = new DecoratorB(concretComponent);
        String expected = "Do docorate operation in decorator B\n" +
                "Do operation in concret component.\n" +
                "Do another decorate operation in decorator B\n";
        Assert.assertEquals(concretComponent.operate(), expected);
    }

    @Test
    public void testDecorateAandB() {
        concretComponent = new DecoratorA(concretComponent);
        concretComponent = new DecoratorB(concretComponent);
        String expected = "Do docorate operation in decorator B\n" +
                "Do decorate operation in decorator A\n" +
                "Do operation in concret component.\n" +
                "Do another decorate operation in decorator B\n";
        Assert.assertEquals(concretComponent.operate(), expected);
    }

}