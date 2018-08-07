/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Run.java
 * Date : 18-8-7 下午9:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.multi;

public class Run {
    private static final int THREAD_COUNT = 10;

    public static void main(String... args) {
        ProducerThread[] producerThreads = new ProducerThread[THREAD_COUNT];
        ConsumerThread[] consumerThreads = new ConsumerThread[THREAD_COUNT];
        Object lock = new Object();
        Container container = new Container();
        for (ProducerThread pt : producerThreads) {
            pt = new ProducerThread(lock, container);
            pt.start();
        }
        for (ConsumerThread ct : consumerThreads) {
            ct = new ConsumerThread(lock, container);
            ct.start();
        }
    }
}
