/*
 * Copyright (c) 2018.
 * Project : kata
 * File : LinkedList.java
 * Date : 18-4-4 上午10:20
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.linkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        if (tail == null) {
            head.setNext(node);
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public boolean find(Node node) {
        Node curr;
        if (head == null)
            return false;
        if (head == node) {
            return true;
        }

        curr = head;
        while (curr.hasNext()) {
            curr = curr.getNext();
            if (curr == node) {
                return true;
            }
        }
        return false;
    }

    /**
     * traverse the whole list
     *
     * @return description of list
     */
    public String traverse() {
        return traverse(Integer.MAX_VALUE);
    }

    /**
     * traverse indicated numbers of nodes
     *
     * @param times represents traverse how many nodes from root
     * @return description of list
     */
    public String traverse(int times) {
        if (head == null)
            return "";
        StringBuilder result = new StringBuilder();
        Node curr = head;
        for (int i = 1; i <= times; i++) {
            result.append(curr.getInfo()).append("\n");
            if (curr.hasNext()) {
                curr = curr.getNext();
            } else {
                break;
            }
        }
        return result.toString();
    }

}
