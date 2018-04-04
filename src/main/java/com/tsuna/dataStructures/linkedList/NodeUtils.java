/*
 * Copyright (c) 2018.
 * Project : kata
 * File : NodeUtils.java
 * Date : 18-4-4 下午12:42
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.linkedList;

public class NodeUtils {
    /**
     * Get current node's next next node.
     *
     * @param node searched node
     * @return the node found,or {@code null} if no nodes next
     */
    public static Node getTheSecondNext(Node node) {
        if (!node.hasNext())
            return null;
        if (!node.getNext().hasNext()) {
            return null;
        }
        return node.getNext().getNext();
    }
}
