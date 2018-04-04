/*
 * Copyright (c) 2018.
 * Project : kata
 * File : LinkedListTest.java
 * Date : 18-4-4 下午2:13
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList linkedList;
    private LinkedList oneNodeLinkedList;
    private Node innerNode;
    private Node outerNode;

    @Before
    public void instantiate() {
        linkedList = new LinkedList(new Node("node:1"));
        linkedList.add(new Node("node:2"));
        innerNode = new Node("inner node");
        outerNode = new Node("outer node");
        linkedList.add(innerNode);
        oneNodeLinkedList = new LinkedList(new Node("only node"));
    }

    @Test
    public void find() {
        Assert.assertEquals(true, linkedList.find(innerNode));
        Assert.assertEquals(false, linkedList.find(outerNode));
    }

    @Test
    public void traverse() {
        //test normal
        String expected = "node:1\n" +
                "node:2\n" +
                "inner node\n";
        Assert.assertEquals(expected, linkedList.traverse(3));
        //test amplify 'times' parameter
        Assert.assertEquals(expected, linkedList.traverse(10));
        //test reduce 'times' parameter
        expected = "node:1\n" + "node:2\n";
        Assert.assertEquals(expected, linkedList.traverse(2));
        //test traverse one node list
        expected = "only node\n";
        Assert.assertEquals(expected, oneNodeLinkedList.traverse(2));
        Assert.assertEquals(expected, oneNodeLinkedList.traverse(1));
        Assert.assertEquals("", oneNodeLinkedList.traverse(0));
    }
}