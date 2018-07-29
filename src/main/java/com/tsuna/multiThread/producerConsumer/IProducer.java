/*
 * Copyright (c) 2018.
 * Project : kata
 * File : IProducer.java
 * Date : 18-7-29 下午8:03
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer;

/**
 * Represents the producer which produce values
 */
public interface IProducer {
    /**
     * Produce values and store it prepared to use
     */
    void produce();
}
