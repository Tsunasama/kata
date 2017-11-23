/*
 * Copyright (c) 2017.
 * Project : kata
 * File : HashTable.java
 * Date : 17-11-23 下午5:37
 * Tsunasama All rights reserved.
 */

package com.tsuna.dataStructures.sets;

public class HashTable {
    private static final int DEFAULT_CAPACITY = 5;
    private static final float LOAD_FACTOR = 0.75f;
    private Entry[] table = new Entry[DEFAULT_CAPACITY];
    private int size = 0;//numbers of Entries in hash table
    private int indexUsed = 0;//table's index used

    public void put(int key, int value) {
        int index = hash(key);
        if (table[index] == null)//set head entry
            table[index] = new Entry();
        Entry e = table[index];
        if (e.getNext() == null) {
            table[index].setNext(new Entry(key, value));
            size++;
            indexUsed++;
            if (needExpanded())
                expand();
        } else {
            for (e = e.getNext(); e != null; e = e.getNext()) {
                if (e.getKey() == key) {
                    e.setValue(value);
                    return;
                }
            }
            Entry newEntry = new Entry(key, value, table[index].getNext());
            table[index].setNext(newEntry);
            size++;
        }
    }

    private int hash(int key) {
        return key % table.length;
    }

    private boolean needExpanded() {
        return indexUsed >= table.length * LOAD_FACTOR;
    }

    public void remove(int key) {
        int index = hash(key);
        if (table[index] != null && table[index].getNext() != null) {
            Entry e = table[index];
            Entry pre = table[index];
            for (e = e.getNext(); e != null; pre = e, e = e.getNext()) {
                if (e.getKey() == key) {
                    pre.setNext(e.getNext());
                    size--;
                    return;
                }
            }
        }
    }

    public int get(int key) {
        int index = hash(key);
        if (table[index] != null && table[index].getNext() != null) {
            Entry temp = table[index];
            while (temp.getNext() != null) {
                Entry current = temp.getNext();
                if (current.getKey() == key)
                    return current.getValue();
                temp = current;
            }
        }
        return -1;
    }

    /**
     * Expand the capacity(make the length of entry array multiply two times
     */
    private void expand() {
        int newLength = table.length * 2;
        Entry[] oldTable = table;
        table = new Entry[newLength];
        indexUsed = 0;
        for (Entry anOldTable : oldTable) {
            if (anOldTable != null && anOldTable.getNext() != null) {
                Entry temp = anOldTable;
                while (temp.getNext() != null) {
                    Entry current = temp.getNext();//being retrieved entry
                    int index = hash(current.getKey());
                    if (table[index] == null) {
                        indexUsed++;
                        table[index] = new Entry();
                    }
                    Entry newEntry = new Entry(current.getKey(), current.getValue(), current.getNext());
                    table[index].setNext(newEntry);
                    temp = current;
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    int getIndexUsed() {
        return indexUsed;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Entry aTable : table) {
            if (aTable != null && aTable.getNext() != null) {
                Entry temp = aTable;
                while (temp.getNext() != null) {
                    Entry current = temp.getNext();
                    result.append("{key:").append(current.getKey()).append(" value:").append(current.getValue()).append("} ");
                    temp = current;
                }
                result.append("\n");
            }
        }
        return result.toString();
    }
}
