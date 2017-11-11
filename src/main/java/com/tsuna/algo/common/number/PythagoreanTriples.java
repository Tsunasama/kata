/*
 * Copyright (c) 2017.
 * Project : kata
 * File : pythagoreanTriples.java
 * Date : 17-11-11 下午9:04
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class PythagoreanTriples {
    static Stream<int[]> findPythagoreanTriples(int min, int max) {
        if (min > max || min < 1)
            throw new IllegalArgumentException();
        return IntStream.rangeClosed(min, max).boxed()
                .flatMap(i ->
                        IntStream.rangeClosed(i, max)
                                .filter(j -> Math.sqrt(i * i + j * j) % 1 == 0).mapToObj(j -> new int[]{i, j, (int) Math.sqrt(i * i + j * j)}));
    }
}
