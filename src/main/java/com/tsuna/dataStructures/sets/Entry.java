/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Entry.java
 * Date : 17-11-23 下午5:21
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

public class Entry {
    private int key = -1;
    private int value = -1;
    private Entry next = null;

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Entry(int key, int value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public Entry() {
    }
}
