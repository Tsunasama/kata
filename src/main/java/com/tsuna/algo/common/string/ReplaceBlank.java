/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ReplaceBlank.java
 * Date : 17-11-5 上午11:25
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.string;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

/**
 * Implement a fuction to replace each blank in string to '%20'.
 */
class ReplaceBlank {
    static void replaceBlank(@NotNull char[] charArray, int length) {
        //str illegal circumstance
        if (charArray.length == 0)
            throw new RuntimeException();
        //length illegal circumstance
        if (length > charArray.length)
            throw new RuntimeException("'length' is illegal.");
        //str's lenth not enough
        if (charArray.length < (length + 2 * getBlank(charArray, length))) {
            throw new RuntimeException("str's length not enough");
        }
        //initialize pointers
        int pWork = length + 2 * getBlank(charArray, length) - 1;
        int pSearch = length - 1;
        //do replacements
        while (pWork > pSearch && pSearch >= 0) {
            if (charArray[pSearch] == ' ') {
                pSearch--;
                charArray[pWork--] = '0';
                charArray[pWork--] = '2';
                charArray[pWork--] = '%';
            } else {
                charArray[pWork--] = charArray[pSearch--];
            }
        }
    }

    private static int getBlank(char[] array, int length) {
        int blankCount = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == ' ')
                blankCount++;
        }
        return blankCount;
    }
}
