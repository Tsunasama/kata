/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Runner.java
 * Date : 18-7-29 下午7:53
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.single;

public class Runner {
    public static void main(String... args) {
        Object lock = new Object();
        Store store = new Store();
        Consumer consumer = new Consumer(lock, store);
        Producer producer = new Producer(lock, store);
        ConsumerThread consumerThread = new ConsumerThread(consumer);
        ProducerThread producerThread = new ProducerThread(producer);
        consumerThread.start();
        producerThread.start();
    }
}
