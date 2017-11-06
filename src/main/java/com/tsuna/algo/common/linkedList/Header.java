/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Head.java
 * Date : 17-11-6 下午6:50
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.linkedList;

/**
 * This class just as the head linker to a linked list
 */
class Header {
    private Node node;

    Header() {
    }

    Header(Node node) {
        this.node = node;
    }

    Node getHeaderNode() {
        return node;
    }

    void setHeaderNode(Node node) {
        this.node = node;
    }

    String getExpressionOfList() {
        if (node == null)
            throw new RuntimeException();
        Node temp = this.node;
        StringBuilder result = new StringBuilder();
        do {
            result.append(temp.toString());
            temp = temp.getNextNode();
        } while (temp != null);
        return result.toString();
    }
}
