/*
 * Copyright (c) 2017.
 * Project : kata
 * File : SieveOfEratosthenes.java
 * Date : 17-11-7 下午3:22
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.primeNumber;

import java.util.ArrayList;
import java.util.List;

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
        while (current < Math.sqrt(max)) {
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
}
