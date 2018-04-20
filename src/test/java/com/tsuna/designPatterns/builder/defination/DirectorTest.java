/*
 * Copyright (c) 2018.
 * Project : kata
 * File : DirectorTest.java
 * Date : 18-4-20 上午10:52
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination;

import com.tsuna.designPatterns.builder.defination.product.Product;
import org.junit.Assert;
import org.junit.Test;

public class DirectorTest {
    private Product product;
    private Director director = new Director();

    @Test
    public void getProductAModelA() {
        product = director.getProductAModelA();
        String expected = "RealProductA do Action 'A'\n" +
                "RealProductA do Action 'B'\n" +
                "RealProductA do Action 'C'\n";
        Assert.assertEquals(expected, product.run());
    }

    @Test
    public void getProductAModelB() {
        product = director.getProductAModelB();
        String expected = "RealProductA do Action 'C'\n" +
                "RealProductA do Action 'B'\n" +
                "RealProductA do Action 'A'\n";
        Assert.assertEquals(expected, product.run());
    }

    @Test
    public void getProductBModelA() {
        product = director.getProductBModelA();
        String expected = "RealProductB do Action 'A'\n" +
                "RealProductB do Action 'B'\n" +
                "RealProductB do Action 'C'\n";
        Assert.assertEquals(expected, product.run());
    }

    @Test
    public void getProductBModelB() {
        product = director.getProductBModelB();
        String expected = "RealProductB do Action 'C'\n" +
                "RealProductB do Action 'B'\n" +
                "RealProductB do Action 'A'\n";
        Assert.assertEquals(expected, product.run());
    }

    @Test
    public void testSequenceProduce() {
        Product product1 = director.getProductAModelA();
        Product product2 = director.getProductAModelB();
        String expected1 = "RealProductA do Action 'A'\n" +
                "RealProductA do Action 'B'\n" +
                "RealProductA do Action 'C'\n";
        String expected2 = "RealProductA do Action 'C'\n" +
                "RealProductA do Action 'B'\n" +
                "RealProductA do Action 'A'\n";
        Assert.assertEquals(expected1, product1.run());
        Assert.assertEquals(expected2, product2.run());
    }
}