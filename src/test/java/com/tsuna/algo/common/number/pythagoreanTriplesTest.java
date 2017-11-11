/*
 * Copyright (c) 2017.
 * Project : kata
 * File : pythagoreanTriplesTest.java
 * Date : 17-11-11 下午9:21
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class pythagoreanTriplesTest {
    @Test
    public void findPythagoreanTriples() throws Exception {
        Stream<int[]> first5PythagoreanTriples = PythagoreanTriples.findPythagoreanTriples(1, 100);
        final List<String> results = new ArrayList<>();
        first5PythagoreanTriples.limit(5).forEach(t -> {
            String temp = t[0] + ", " + t[1] + ", " + t[2] + "\n";
            results.add(temp);
        });

        List<String> prepared = Arrays.asList("3, 4, 5\n", "5, 12, 13\n", "6, 8, 10\n", "7, 24, 25\n", "8, 15, 17\n");
        for (int i = 0; i < results.size(); i++) {
            Assert.assertEquals(prepared.get(i), results.get(i));
        }
    }

}