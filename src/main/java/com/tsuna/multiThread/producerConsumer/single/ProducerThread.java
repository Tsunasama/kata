/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ProduceThread.java
 * Date : 18-7-29 下午7:58
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.single;

public class ProducerThread extends Thread {
    private Producer producer;

    public ProducerThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                producer.produce();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
