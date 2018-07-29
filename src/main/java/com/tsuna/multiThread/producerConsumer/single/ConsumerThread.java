/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ConsumerThread.java
 * Date : 18-7-29 下午7:57
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.single;

public class ConsumerThread extends Thread {
    private Consumer consumer;

    public ConsumerThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                consumer.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
