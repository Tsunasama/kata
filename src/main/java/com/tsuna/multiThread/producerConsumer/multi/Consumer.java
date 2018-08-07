/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Consumer.java
 * Date : 18-8-7 下午9:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.multi;

import com.tsuna.multiThread.producerConsumer.IConsumer;

public class Consumer implements IConsumer {
    private Container container;
    private final Object lock;

    public Consumer(Container container, Object lock) {
        this.container = container;
        this.lock = lock;
    }

    @Override
    public void consume() {
        try {
            synchronized (lock) {
                while (container.getConduct().isEmpty()) {
                    lock.wait();
                }
                String product = container.getConduct();
                System.out.println("Consume product:" + product);
                container.setConduct("");
                Thread.sleep(100);
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
