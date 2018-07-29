/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Store.java
 * Date : 18-7-29 下午7:39
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.single;

import com.sun.istack.internal.NotNull;

/**
 * Container to store values to be used.
 */
public class Store {
    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(@NotNull String value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public void reset() {
        setValue("");
    }
}
