/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Node.java
 * Date : 18-4-4 上午10:14
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.linkedList;

/**
 * Represents a node in the linked list
 */
public class Node {

    private Node next;
    private String info;

    Node(String info) {
        this.info = info;
    }

    Node() {
        this.info = "";
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean hasNext() {
        return getNext() != null;
    }
}
