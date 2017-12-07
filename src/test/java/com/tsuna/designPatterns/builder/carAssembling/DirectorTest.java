/*
 * Copyright (c) 2017.
 * Project : kata
 * File : DirectorTest.java
 * Date : 17-12-7 下午2:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {
    private Director director;

    @Before
    public void initialize() {
        director = new Director();
    }

    @Test
    public void getBenzAModel() throws Exception {
        Assert.assertEquals(
                "Benz started.\n" +
                        "Benz stoped.\n",
                director.getBenzAModel().run());
    }

    @Test
    public void getBenzBModel() throws Exception {
        Assert.assertEquals(
                "Benz engine boomed.\n" +
                        "Benz alarmed.\n" +
                        "Benz started.\n" +
                        "Benz stoped.\n",
                director.getBenzBModel().run()
        );
    }

    @Test
    public void getBmwAModel() throws Exception {
        Assert.assertEquals(
                "BMW started.\n" +
                        "BMW stoped.\n",
                director.getBmwAModel().run()
        );
    }

    @Test
    public void getBmwBModel() throws Exception {
        Assert.assertEquals(
                "BMW engine boomed.\n" +
                        "BMW alarmed.\n" +
                        "BMW started.\n" +
                        "BMW stoped.\n",
                director.getBmwBModel().run()
        );
    }

}