/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Producer.java
 * Date : 18-8-7 下午9:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.multi;

import com.tsuna.multiThread.producerConsumer.IProducer;

public class Producer implements IProducer {
    private final Object lock;
    private Container container;

    public Producer(Object lock, Container container) {
        this.lock = lock;
        this.container = container;
    }

    @Override
    public void produce() {
        try {
            synchronized (lock) {
                while (!container.getConduct().isEmpty()) {//use 'while' to prevent thread notified without check the condition
                    lock.wait();
                }
                String product = "[ " + System.currentTimeMillis() + " ]";
                System.out.println("Produce:" + product);
                container.setConduct(product);
                Thread.sleep(100);
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
