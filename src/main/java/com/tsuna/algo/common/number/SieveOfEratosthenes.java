/*
 * Copyright (c) 2017.
 * Project : kata
 * File : SieveOfEratosthenes.java
 * Date : 17-11-7 下午3:22
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class SieveOfEratosthenes {
    static List<Integer> find(int topLimit) {
        //Unexpected paremeter check up
        if (topLimit < 2)
            throw new IllegalArgumentException("Parameter:topLimit cannot below 2");

        int max = topLimit;
        int current = 2;
        List<Integer> result = new ArrayList<>();
        //Initialize result set
        for (int i = 2; i <= max; i++) {
            result.add(i);
        }
        while (current <= Math.sqrt(max)) {
            result = cleanMultiplication(result, current);
            max = result.get(result.size() - 1);
            current++;
        }
        return result;
    }

    static List<Integer> cleanMultiplication(List<Integer> values, int current) {
        List<Integer> result = new ArrayList<>();
        int index;
        for (index = 0; values.get(index) <= current; index++) {
            result.add(values.get(index)); //Add numbers before current to result set
        }
        while (index < values.size()) {
            if (values.get(index) % current != 0)
                result.add(values.get(index));
            index++;
        }
        return result;
    }

    /**
     * @param limit:the max number
     * @return boolean array,of which indexes indicate the checked number,and array content shows if the index number is prime factor
     */
    static boolean[] findUsingBoolean(int limit) {
        if (limit < 1)
            throw new IllegalArgumentException("Parameter:limit cannot less than 1");
        boolean[] results = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++)
            results[i] = true; // initial all to true
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            for (int j = i + 1; j <= limit; j++)
                if (results[i])
                    if (j % i == 0)
                        results[j] = false;
        }
        return results;
    }

    /**
     * Using lambda to parallel compute
     *
     * @param limit:max number
     * @return result array
     */
    static int[] findUsingLambda(int limit) {
        if (limit < 1)
            throw new IllegalArgumentException("Parameter:limit cannot less than 1");
        int range = (int) Math.sqrt(limit);
        int[] result = IntStream.rangeClosed(2, limit).parallel().filter(i -> {
            if (i == 2) {
                return true;
            }
            if (i <= range) {
                return IntStream.rangeClosed(2, i - 1).noneMatch(j -> i % j == 0);
            }
            return IntStream.rangeClosed(2, range).noneMatch(j -> i % j == 0);
        }).toArray();
        return result;
    }
}
