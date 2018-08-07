/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ProducerThread.java
 * Date : 18-8-7 下午9:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.multi;

/**
 * Consistently produce 'product' which can be consumed by producer
 */
public class ProducerThread extends Thread {

    private Producer producer;

    /**
     * @param lock      the lock object to make threads running consistently
     * @param container hold the product
     */
    public ProducerThread(Object lock, Container container) {
        producer = new Producer(lock, container);
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            producer.produce();
        }
    }
}
