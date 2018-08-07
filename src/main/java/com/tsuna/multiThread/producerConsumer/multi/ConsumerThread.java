/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ConsumerThread.java
 * Date : 18-8-7 下午9:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.multi;

/**
 * Consistantly consume 'product' produced by producer
 */
public class ConsumerThread extends Thread {

    private Consumer consumer;

    /**
     * @param lock      the lock object to make threads running consistently
     * @param container hold the product
     */
    public ConsumerThread(Object lock, Container container) {
        consumer = new Consumer(container, lock);
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            consumer.consume();
        }
    }
}
