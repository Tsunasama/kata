/*
 * Copyright (c) 2017.
 * Project : kata
 * File : addAtTheEndOfLinkedList.java
 * Date : 17-11-6 下午6:42
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.linkedList;

import com.sun.istack.internal.NotNull;

class AdjustNode {
    static void addAtTheEnd(@NotNull Header start, Node added) {
        //prerequisites judgement
        if (start == null || start.getHeaderNode() == null)
            throw new RuntimeException();
        Node end = start.getHeaderNode();
        while (end.getNextNode() != null) //To find end node
            end = end.getNextNode();
        end.setNextNode(added);
    }

    static boolean addBehindSpecificNode(@NotNull Header start, int data, @NotNull Node added) {
        //prerequisites judgement
        if (start == null || start.getHeaderNode() == null)
            throw new RuntimeException();
        if (added == null)
            throw new IllegalArgumentException("Added node cannot be null");

        Node temp = start.getHeaderNode();
        do {
            if (temp.getData() == data) { //To find specific node
                added.setNextNode(temp.getNextNode());
                temp.setNextNode(added);
                return true;
            }
            temp = temp.getNextNode();
        } while (temp != null);
        //Node not exist
        return false;
    }

    static boolean deleteSpecificNode(@NotNull Header start, int data) {
        if (start == null || start.getHeaderNode() == null)
            throw new RuntimeException();
        Node temp = start.getHeaderNode();
        //if delete first node
        if (temp.getData() == data) {
            start.setHeaderNode(temp.getNextNode());
            //Make they two to null just to show that temp node now is not used,and we can gc it
            temp.setNextNode(null);
            temp = null;
            return true;
        }
        while (temp.getNextNode() != null) {
            if (temp.getNextNode().getData() == data) {
                Node nextNode = temp.getNextNode();
                temp.setNextNode(nextNode.getNextNode());
                //To show that next node is not used and waiting for gc
                nextNode = null;
                return true;
            }
            temp = temp.getNextNode();
        }
        return false;
    }
}
