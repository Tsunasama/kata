/*
 * Copyright (c) 2017.
 * Project : kata
 * File : HashTableTest.java
 * Date : 17-11-23 下午6:46
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    private HashTable hashTable;

    @Before
    public void initialize() {
        hashTable = new HashTable();
        hashTable.put(1, 11);
        hashTable.put(6, 66);
        hashTable.put(3, 33);
    }

    private void putOverCapacity() {
        hashTable.put(0, 100);
        hashTable.put(2, 22);
        hashTable.put(4, 44);
        hashTable.put(7, 77);

    }

    @Test
    public void put() throws Exception {
        hashTable.put(2, 22);
        String result = "{key:6 value:66} {key:1 value:11} \n" +
                "{key:2 value:22} \n" +
                "{key:3 value:33} \n";
        Assert.assertEquals(result, hashTable.toString());
    }

    @Test
    public void testPutOverCapacity() {
        putOverCapacity();
        Assert.assertEquals(7, hashTable.getIndexUsed());
    }

    @Test
    public void remove() throws Exception {
        hashTable.remove(1);
        String result1 = "{key:6 value:66} \n" +
                "{key:3 value:33} \n";
        Assert.assertEquals(result1, hashTable.toString());

        hashTable.remove(0);
        Assert.assertEquals(result1, hashTable.toString());
    }

    @Test
    public void get() throws Exception {
        Assert.assertEquals(11, hashTable.get(1));
        Assert.assertEquals(66, hashTable.get(6));
        Assert.assertEquals(33, hashTable.get(3));
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(3, hashTable.getSize());
    }

    @Test
    public void testToString() {
        String result = "{key:6 value:66} {key:1 value:11} \n" +
                "{key:3 value:33} \n";
        Assert.assertEquals(result, hashTable.toString());
    }
}