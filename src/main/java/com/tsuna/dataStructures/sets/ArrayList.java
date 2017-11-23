/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ArrayList.java
 * Date : 17-11-23 下午4:36
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

import java.util.Arrays;

public class ArrayList {
    private static final int INITIAL_SIZE = 10;
    private int[] array;
    private int size = 0;

    public ArrayList() {
        array = new int[INITIAL_SIZE];
    }

    public void add(int num) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = num;
    }

    public int get(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int set(int index, int num) {
        int oldNum = get(index);
        array[index] = num;
        return oldNum;
    }

    public int size() {
        return this.size;
    }

    int getInnerArrayLength() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        for (int i = 0; i < size; i++) {
            result.append(get(i)).append(", ");
        }
        result.deleteCharAt(result.length() - 2);
        result.append("]");
        return result.toString();
    }
}
