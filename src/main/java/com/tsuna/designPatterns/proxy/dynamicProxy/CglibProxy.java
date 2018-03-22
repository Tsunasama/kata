/*
 * Copyright (c) 2018.
 * Project : kata
 * File : CglibProxy.java
 * Date : 18-3-22 上午9:50
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer;

    public Object getProxy(Class clazz) {
        enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //Advisor
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        StringBuilder result = new StringBuilder();
        result.append(PerformanceMonitor.begin(objects.getClass().getName() + "." + method.getName()));
        result.append(methodProxy.invokeSuper(o, objects));
        result.append(PerformanceMonitor.end());
        return result.toString();
    }
}
