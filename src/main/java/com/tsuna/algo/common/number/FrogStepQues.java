/*
 * Copyright (c) 2018.
 * Project : kata
 * File : FrogStep.java
 * Date : 18-4-10 上午7:38
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>It is an application of Fibonacci</b><br/>
 * Question:A frog jumps on the footstep,total footstep is provided,providing the frog can jump 1 step,
 * 2 steps,3 steps,4 steps or 5 steps each time,to jump to the top of footstep.<br/>
 * Ask: how many kinds of ways to jump to the top of footstep
 */
public class FrogStepQues {
    /**
     * A recursion solution for good comprehension but waste of computing
     *
     * @param footstep total steps
     * @return ways to the top
     */
    public static long getJumpTimesUsingRecursion(int footstep) {
        //Unusual circumstance
        if (footstep < 0)
            throw new IllegalArgumentException("parameter:'footstep' cannot less than 0");
        if (footstep < 5) {
            //Special conditions here,there are also bondary condition
            switch (footstep) {
                case 0:
                    return 1;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return getJumpTimesUsingRecursion(2) + getJumpTimesUsingRecursion(1) + getJumpTimesUsingRecursion(0);
                case 4:
                    return getJumpTimesUsingRecursion(3) + getJumpTimesUsingRecursion(2) + getJumpTimesUsingRecursion(1) + getJumpTimesUsingRecursion(0);

            }
        }
        //Normal condition
        return getJumpTimesUsingRecursion(footstep - 1) + getJumpTimesUsingRecursion(footstep - 2) +
                getJumpTimesUsingRecursion(footstep - 3) + getJumpTimesUsingRecursion(footstep - 4) +
                getJumpTimesUsingRecursion(footstep - 5);
    }

    /**
     * A iteration implementation,saves the computing resource
     *
     * @param footstep total steps
     * @return kinds of ways to get to top of footstep
     */
    public static long getJumpTimesUsingIteration(int footstep) {
        //Unusual circumstance
        if (footstep < 0)
            throw new IllegalArgumentException("Parameter:'footstep' cannot less than 0");
        List<Long> results = new ArrayList<>();
        //Initialize total 0 and 1 step
        results.add(0, 1L);
        results.add(1, 1L);
        //Initalize 2-footstep total steps
        for (int i = 2; i <= footstep; i++) {
            //Special conditions here
            if (i < 5) {
                long steps = 0;
                for (int j = 0; j < i; j++) {
                    steps += results.get(j);
                }
                results.add(i, steps);
            } else {
                results.add(i, results.get(i - 1) + results.get(i - 2) + results.get(i - 3) + results.get(i - 4) + results.get(i - 5));
            }
        }
        return results.get(footstep);
    }
}
