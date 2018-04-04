/*
 * Copyright (c) 2018.
 * Project : kata
 * File : LinkedListUtilsTest.java
 * Date : 18-4-4 上午10:45
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListUtilsTest {

    @Test
    public void testCreateLinkedList() {
        //test normal
        LinkedList list = LinkedListUtils.createLinkedList(10);
        String expected = "node:1\n" +
                "node:2\n" +
                "node:3\n" +
                "node:4\n" +
                "node:5\n" +
                "node:6\n" +
                "node:7\n" +
                "node:8\n" +
                "node:9\n" +
                "node:10\n";
        Assert.assertEquals(expected, list.traverse());
        //test a list with one node
        LinkedList list1 = LinkedListUtils.createLinkedList(1);
        expected = "node:1\n";
        Assert.assertEquals(expected, list1.traverse());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateLinkedListWithWrongParameter() {
        LinkedListUtils.createLinkedList(0);
    }

    @Test
    public void testCreateCircledLinkedList() {
        //test normal
        LinkedList linkedList = LinkedListUtils.createCricledLinkedList(5, 3);
        String expected = "node:1\n" +
                "node:2\n" +
                "node:3\n" +
                "node:4\n" +
                "node:5\n" +
                "node:3\n" +
                "node:4\n" +
                "node:5\n" +
                "node:3\n" +
                "node:4\n";
        Assert.assertEquals(expected, linkedList.traverse(10));
        //test a circle list with only one node
        LinkedList linkedList1 = LinkedListUtils.createCricledLinkedList(1, 1);
        expected = "node:1\n" +
                "node:1\n" +
                "node:1\n";
        Assert.assertEquals(expected, linkedList1.traverse(3));
        //test a self circled list
        LinkedList linkedList2 = LinkedListUtils.createCricledLinkedList(5, 5);
        expected = "node:1\n" +
                "node:2\n" +
                "node:3\n" +
                "node:4\n" +
                "node:5\n" +
                "node:1\n" +
                "node:2\n" +
                "node:3\n" +
                "node:4\n" +
                "node:5\n";
        Assert.assertEquals(expected, linkedList2.traverse(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCircledLinkedListWithIllegalParameter() {
        LinkedListUtils.createCricledLinkedList(100, 101);
    }

    @Test
    public void testGetCircleLength() {
        //test normal
        LinkedList circleList1 = LinkedListUtils.createCricledLinkedList(7, 3);
        Assert.assertEquals(3, LinkedListUtils.getCircleLength(circleList1));
        //test a circle list with only one node
        LinkedList circleList2 = LinkedListUtils.createCricledLinkedList(1, 1);
        Assert.assertEquals(0, LinkedListUtils.getCircleLength(circleList2));
        //test pressure
        LinkedList circleList3 = LinkedListUtils.createCricledLinkedList(10000, 500);
        Assert.assertEquals(500, LinkedListUtils.getCircleLength(circleList3));
        //test a list with only one node
        LinkedList list1 = LinkedListUtils.createLinkedList(1);
        Assert.assertEquals(-1, LinkedListUtils.getCircleLength(list1));
        //test not circled list
        LinkedList list2 = LinkedListUtils.createLinkedList(10000);
        Assert.assertEquals(-1, LinkedListUtils.getCircleLength(list2));
    }
}