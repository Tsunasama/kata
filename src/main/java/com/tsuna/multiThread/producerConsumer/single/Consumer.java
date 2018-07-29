/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Consumer.java
 * Date : 18-7-29 下午7:40
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.single;

import com.tsuna.multiThread.producerConsumer.IConsumer;

public class Consumer implements IConsumer {
    private Store store;
    private final Object lock;

    public Consumer(Object lock, Store store) {
        this.lock = lock;
        this.store = store;
    }

    @Override
    public void consume() {
        try {
            synchronized (lock) {
                while (store.isEmpty()) {
                    lock.wait();
                }
                String value = store.getValue();
                System.out.println("Consume value : " + value);
                store.reset();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
