/*
 * Copyright (c) 2018.
 * Project : kata
 * File : FrogStepQuesTest.java
 * Date : 18-4-10 上午8:37
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import org.junit.Assert;
import org.junit.Test;

public class FrogStepQuesTest {

    @Test
    public void testGetJumpTimesUsingRecursion() {
        //Bondary conditions
        Assert.assertEquals(1L, FrogStepQues.getJumpTimesUsingRecursion(0));
        Assert.assertEquals(1L, FrogStepQues.getJumpTimesUsingRecursion(1));
        Assert.assertEquals(2L, FrogStepQues.getJumpTimesUsingRecursion(2));
        Assert.assertEquals(4L, FrogStepQues.getJumpTimesUsingRecursion(3));
        Assert.assertEquals(8L, FrogStepQues.getJumpTimesUsingRecursion(4));
        Assert.assertEquals(16L, FrogStepQues.getJumpTimesUsingRecursion(5));
        //Normal conditions
        Assert.assertEquals(31L, FrogStepQues.getJumpTimesUsingRecursion(6));
        Assert.assertEquals(61L, FrogStepQues.getJumpTimesUsingRecursion(7));
        Assert.assertEquals(120L, FrogStepQues.getJumpTimesUsingRecursion(8));
        Assert.assertEquals(236L, FrogStepQues.getJumpTimesUsingRecursion(9));
        Assert.assertEquals(464L, FrogStepQues.getJumpTimesUsingRecursion(10));
        Assert.assertEquals(400096L, FrogStepQues.getJumpTimesUsingRecursion(20));
        //Performance test
        //It is unable to compute the result
        //Assert.assertEquals(3336766080248221832L,FrogStepQues.getJumpTimesUsingRecursion(100));
    }

    @Test
    public void testGetJumpTimesUsingIteration() {
        //Bondary conditions
        Assert.assertEquals(1L, FrogStepQues.getJumpTimesUsingIteration(0));
        Assert.assertEquals(1L, FrogStepQues.getJumpTimesUsingIteration(1));
        Assert.assertEquals(2L, FrogStepQues.getJumpTimesUsingIteration(2));
        Assert.assertEquals(4L, FrogStepQues.getJumpTimesUsingIteration(3));
        Assert.assertEquals(8L, FrogStepQues.getJumpTimesUsingIteration(4));
        Assert.assertEquals(16L, FrogStepQues.getJumpTimesUsingIteration(5));
        //Normal conditions
        Assert.assertEquals(31L, FrogStepQues.getJumpTimesUsingIteration(6));
        Assert.assertEquals(61L, FrogStepQues.getJumpTimesUsingIteration(7));
        Assert.assertEquals(120L, FrogStepQues.getJumpTimesUsingIteration(8));
        Assert.assertEquals(236L, FrogStepQues.getJumpTimesUsingIteration(9));
        Assert.assertEquals(464L, FrogStepQues.getJumpTimesUsingIteration(10));
        Assert.assertEquals(400096L, FrogStepQues.getJumpTimesUsingIteration(20));
        //Performance test
        Assert.assertEquals(3336766080248221832L, FrogStepQues.getJumpTimesUsingIteration(100));
    }
}