/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Fibonacci.java
 * Date : 17-11-12 上午9:52
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Fibonacci {
    static Integer[] getFiboWithLambda(int count) {
        if (count < 1)
            throw new IllegalArgumentException("parameter:count cannot less than 1");
        List<Integer> result = new ArrayList<>();
        Stream.iterate(
                new int[]{0, 1},
                i -> new int[]{i[1], i[0] + i[1]})
                .limit(count)
                .forEach(i -> result.add(i[0]));
        return result.toArray(new Integer[count]);
    }

    static int find(int index) {
        if (index == 1)
            return 0;
        if (index == 2)
            return 1;
        return find(index - 2) + find(index - 1);
    }
}
