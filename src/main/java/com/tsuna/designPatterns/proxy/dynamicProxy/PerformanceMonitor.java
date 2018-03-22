/*
 * Copyright (c) 2018.
 * Project : kata
 * File : PerformanceMonitor.java
 * Date : 18-3-22 上午6:57
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

/**
 * This class contains several static method just to monitor the status
 * of method executing
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<>();

    public static String begin(String method) {
        String record = "begin monitor...\n";
        MethodPerformance methodPerformance = new MethodPerformance(method);
        performanceRecord.set(methodPerformance);
        return record;
    }

    public static String end() {
        StringBuilder result = new StringBuilder();
        MethodPerformance performance = performanceRecord.get();
        result.append("end record...\n");
        //result.append(performance.printPerformance());
        return result.toString();
    }
}
