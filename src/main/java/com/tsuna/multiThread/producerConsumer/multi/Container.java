/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Container.java
 * Date : 18-8-7 下午9:59
 * Tsunasama All rights reserved.
 */

package com.tsuna.multiThread.producerConsumer.multi;

public class Container {
    private String conduct = "";

    public synchronized String getConduct() {
        return conduct;
    }

    public synchronized void setConduct(String conduct) {
        this.conduct = conduct;
    }
}
