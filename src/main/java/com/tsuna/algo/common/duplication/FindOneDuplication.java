/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FindOneDuplication.java
 * Date : 17-11-3 下午7:31
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.duplication;

class FindOneDuplication {
    /**
     * In an array of which length equals to n+1 and all number between 1~n.
     * Some number may be duplication.
     * Find One.
     * (Dont't make any changes in original array)
     */
    static int findDuplication(int[] array) {
        if (array == null) {
            throw new RuntimeException("Parameter array cannot be null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array.length || array[i] < 1)
                throw new IllegalArgumentException();
        }
        int start = 1;
        int end = array.length - 1;
        while (start != end) {
            int mid = (start + end) / 2;
            if (getCount(array, start, mid) > (mid - start + 1))
                end = mid;
            else if (getCount(array, mid + 1, end) > (end - mid))
                start = mid + 1;
            else
                return 0;
        }
        return start;
    }

    private static int getCount(int[] array, int start, int end) {
        if (array == null)
            throw new RuntimeException("Parameter array cannot be null");
        if (start > end || start < 1 || end >= array.length)
            throw new RuntimeException("Parameter wrong");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= start && array[i] <= end)
                ++count;
        }
        return count;
    }
}
