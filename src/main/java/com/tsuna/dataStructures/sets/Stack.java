/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Stack.java
 * Date : 17-11-23 下午9:12
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

import java.util.Arrays;

public class Stack {
    private int size = 0;
    private int[] content;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        content = new int[DEFAULT_CAPACITY];
    }

    public Stack(int size) {
        if (size <= 0)
            content = new int[DEFAULT_CAPACITY];
        content = new int[size];
    }

    public void push(int item) {
        if (size == content.length) {
            content = Arrays.copyOf(content, content.length * 2);
        }
        content[size++] = item;
    }

    public int peek() {
        if (size == 0)
            throw new IndexOutOfBoundsException("Stack is empty.");
        return content[size - 1];
    }

    public int pop() {
        int item = peek();
        size--;
        return item;
    }

    public boolean isFull() {
        return size == content.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("from top to bottom: [ ");
        for (int i = content.length - 1; i >= 0; i--) {
            builder.append(content[i] + ", ");
        }
        builder.deleteCharAt(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}
