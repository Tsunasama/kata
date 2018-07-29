/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Producer.java
 * Date : 18-7-29 下午7:49
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.single;

import com.tsuna.multiThread.producerConsumer.IProducer;

public class Producer implements IProducer {
    private Store store;
    private final Object lock;

    public Producer(Object lock, Store store) {
        this.lock = lock;
        this.store = store;
    }

    @Override
    public void produce() {
        try {
            synchronized (lock) {
                while (!store.isEmpty()) {
                    lock.wait();
                }
                String newValue = "[timestap:" + System.currentTimeMillis() + "]";
                store.setValue(newValue);
                System.out.println("Produce value : " + newValue);
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
