/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Node.java
 * Date : 17-11-6 下午6:38
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.linkedList;

public class Node {
    private Node nextNode = null;
    private int data;

    int getData() {
        return data;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nextNode == null ? String.valueOf(data) : data + "-->";
    }
}
