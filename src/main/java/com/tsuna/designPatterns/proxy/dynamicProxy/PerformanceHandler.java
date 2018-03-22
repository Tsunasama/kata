/*
 * Copyright (c) 2018.
 * Project : kata
 * File : PerformanceHandler.java
 * Date : 18-3-22 上午7:06
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {
    //original obj(invocated obj)
    private Object target;

    PerformanceHandler(Object target) {
        this.target = target;
    }

    //Advice
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StringBuilder result = new StringBuilder();
        result.append(PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName()));
        result.append((String) method.invoke(target, args));
        result.append(PerformanceMonitor.end());
        return result.toString();
    }
}
