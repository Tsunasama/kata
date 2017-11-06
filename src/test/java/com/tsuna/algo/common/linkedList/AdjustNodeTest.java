/*
 * Copyright (c) 2017.
 * Project : kata
 * File : AddNodeTest.java
 * Date : 17-11-6 下午6:54
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdjustNodeTest {
    private Header header1;
    private Header header2;
    private Header header3;
    private Node added;

    @Before
    public void initialize() {
        //header1 initialize
        header1 = null;
        //header2 initialize
        header2 = new Header();
        //header3 initialize
        header3 = new Header();
        Node node1 = new Node(5);
        Node node2 = new Node(45);
        Node node3 = new Node(34);
        header3.setHeaderNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        //added node
        added = new Node(100);
    }

    @Test
    public void testAddAtTheEnd() {
        AdjustNode.addAtTheEnd(header3, added);
        StringBuilder result = new StringBuilder();
        Assert.assertEquals("5-->45-->34-->100", header3.getExpressionOfList());
    }

    @Test(expected = RuntimeException.class)
    public void testAddAtTheEndHeaderNull() {
        AdjustNode.addAtTheEnd(header1, added);
    }

    @Test(expected = RuntimeException.class)
    public void testAddAtTheEndHederNextNull() {
        AdjustNode.addAtTheEnd(header2, added);
    }

    @Test
    public void testAddBehindSpecificNodeAtHead() {
        AdjustNode.addBehindSpecificNode(header3, 5, added);
        Assert.assertEquals("5-->100-->45-->34", header3.getExpressionOfList());
    }

    @Test
    public void testAddBehindSpecificNodeAtMid() {
        AdjustNode.addBehindSpecificNode(header3, 45, added);
        Assert.assertEquals("5-->45-->100-->34", header3.getExpressionOfList());
    }

    @Test
    public void testAddBehindSpecificNodeAtEnd() {
        Boolean judge = AdjustNode.addBehindSpecificNode(header3, 34, added);
        Assert.assertEquals(judge, Boolean.TRUE);
        Assert.assertEquals("5-->45-->34-->100", header3.getExpressionOfList());
    }

    @Test
    public void testAddBehindSpecificNodeWithNotExistData() {
        Boolean judge = AdjustNode.addBehindSpecificNode(header3, 32, added);
        Assert.assertEquals(judge, Boolean.FALSE);
        Assert.assertEquals("5-->45-->34", header3.getExpressionOfList());
    }

    @Test(expected = RuntimeException.class)
    public void testAddBehindSpecificNodeWithNullHeader() {
        AdjustNode.addBehindSpecificNode(header1, 0, added);
    }

    @Test(expected = RuntimeException.class)
    public void testAddBehindSpecificNodeWithNullNextHeader() {
        AdjustNode.addBehindSpecificNode(header2, 0, added);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddBehindSpecificNodeWithNullAddedNode() {
        AdjustNode.addBehindSpecificNode(header3, 0, null);
    }

    @Test
    public void testDeleteSpecificNodeAtFirst() {
        AdjustNode.deleteSpecificNode(header3, 5);
        Assert.assertEquals("45-->34", header3.getExpressionOfList());
    }

    @Test
    public void testDeleteSpecificNodeAtMid() {
        AdjustNode.deleteSpecificNode(header3, 45);
        Assert.assertEquals("5-->34", header3.getExpressionOfList());
    }

    @Test
    public void testDeleteSpecificNodeAtEnd() {
        AdjustNode.deleteSpecificNode(header3, 34);
        Assert.assertEquals("5-->45", header3.getExpressionOfList());
    }

    @Test
    public void testDeleteSpecificNodeNotExistNode() {
        Boolean judgement = AdjustNode.deleteSpecificNode(header3, 35);
        Assert.assertEquals(false, judgement);
    }

    @Test(expected = RuntimeException.class)
    public void testDeleteSpecificNodeWithNullHeader() {
        AdjustNode.deleteSpecificNode(header1, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testDeleteSpecificNodeWithNullNextNode() {
        AdjustNode.deleteSpecificNode(header2, 0);
    }
}