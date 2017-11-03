/*
 * Copyright (c) 2017.
 * Project : kata
 * File : FindIn2DArray.java
 * Date : 17-11-3 下午8:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.searchIn2DArray;

/**
 * In a 2D array,which arrange its row from left to right in an increasingly rank,its column from up to down in an
 * increasingly rank.
 * Give you a number and find wheathe it is in this array.
 */
class FindIn2DArray {
    static boolean findNum(int[][] array, int num) {
        if (array == null)
            throw new IllegalArgumentException();
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            while (array[row][col] < num && row < array.length - 1)
                ++row;
            while (array[row][col] > num && col > 0)
                --col;
            if (array[row][col] == num)
                return true;
            if (row == array.length - 1 || col == 0)
                return false;
        }
        return false;
    }
}
