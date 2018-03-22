/*
 * Copyright (c) 2018.
 * Project : kata
 * File : MethodPerformance.java
 * Date : 18-3-22 上午6:58
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

/**
 * Record the information before and after method executing
 */
public class MethodPerformance {
    private long begin;
    private long end;
    private String serviceName;

    MethodPerformance(String serviceName) {
        this.serviceName = serviceName;
        begin = System.currentTimeMillis();
    }

    public String printPerformance() {
        end = System.currentTimeMillis();
        long elapse = end - begin;
        return serviceName + " spend " + elapse + " millseconds.\n";
    }
}
