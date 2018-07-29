/*
 * Copyright (c) 2018.
 * Project : kata
 * File : IConsumer.java
 * Date : 18-7-29 下午8:03
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer;

/**
 * Represents a consumer which can consume values in use of {@code consume}
 */
public interface IConsumer {
    /**
     * Consume values and make use of it
     */
    void consume();
}
