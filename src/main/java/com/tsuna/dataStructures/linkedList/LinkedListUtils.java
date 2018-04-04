/*
 * Copyright (c) 2018.
 * Project : kata
 * File : LinkedListUtils.java
 * Date : 18-4-4 上午10:29
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.linkedList;

public class LinkedListUtils {
    /**
     * Create a linked list with nodeNum number nodes
     *
     * @param nodeNum number of node to create
     * @return created linked list
     */
    public static LinkedList createLinkedList(int nodeNum) {
        if (nodeNum == 0)
            throw new IllegalArgumentException("'nodeNum' cannot be 0");
        LinkedList linkedList = new LinkedList(new Node("node:1"));
        for (int i = nodeNum - 1; i > 0; i--) {
            linkedList.add(new Node("node:" + (nodeNum - i + 1)));
        }
        return linkedList;
    }

    /**
     * Generate a linked list whick is a circle linked list
     *
     * @param totalNodes  represent the number of total nodes
     * @param circleNodes represent the number of nodes which is in the circle
     * @return created circle linked list
     */
    public static LinkedList createCricledLinkedList(int totalNodes, int circleNodes) {
        if (totalNodes < circleNodes)
            throw new IllegalArgumentException("'totalNodes' must great to 'circleNodes'!");

        Node circlePoint = new Node();
        int circlePointNum = totalNodes - circleNodes + 1;
        LinkedList linkedList = new LinkedList(new Node("node:1"));
        if (circlePointNum == 1)
            circlePoint = linkedList.getHead();
        for (int i = 2; i <= totalNodes; i++) {
            linkedList.add(new Node("node:" + i));
            if (circlePointNum == i) {
                circlePoint = linkedList.getTail();
            }
        }
        linkedList.add(circlePoint);
        return linkedList;
    }

    /**
     * This function implements of finding circle length with space complecity O(1)
     *
     * @return -1 if the list is not circled or a number represents the circle length
     */
    public static int getCircleLength(LinkedList list) {
        if (list.getHead() == null) {
            throw new IllegalArgumentException("list should have at least one element");
        }
        if (list.getHead().getNext() == list.getHead()) {
            return 0;
        }
        Node nextNode = list.getHead();
        Node nextSecondNode = list.getHead();
        int step1 = 0;
        int step2;
        while (nextNode.getNext() != null && NodeUtils.getTheSecondNext(nextSecondNode) != null) {
            nextNode = nextNode.getNext();
            nextSecondNode = NodeUtils.getTheSecondNext(nextSecondNode);
            step1++;
            if (nextNode == nextSecondNode) {
                step2 = step1;
                while (true) {
                    nextNode = nextNode.getNext();
                    nextSecondNode = NodeUtils.getTheSecondNext(nextSecondNode);
                    step2++;
                    if (nextNode == nextSecondNode) {
                        return step2 - step1;
                    }
                }
            }
        }
        return -1;
    }
}
