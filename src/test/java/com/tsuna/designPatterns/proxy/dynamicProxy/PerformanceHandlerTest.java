/*
 * Copyright (c) 2018.
 * Project : kata
 * File : PerformanceHandlerTest.java
 * Date : 18-3-22 上午7:10
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class PerformanceHandlerTest {
    private ForumService target;
    private PerformanceHandler handler;

    @Before
    public void instantiate() {
        target = new ForumServiceImpl();
        handler = new PerformanceHandler(target);
    }

    @Test
    public void testUsingJDKProxy() {
        //using java.lang.reflect.Proxy to build proxy for all methods in target
        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
        //using proxy.removeTopic
        String result = proxy.removeTopic(101);
        String expected = "begin monitor...\n" +
                "remove topic:101\n" +
                "end record...\n";
        Assert.assertEquals(expected, result);
        //using proxy.removeForum
        result = proxy.removeForum(202);
        expected = "begin monitor...\n" +
                "remove forum:202\n" +
                "end record...\n";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUsingCglibProxy() {
        //create proxy
        ForumService proxy = (ForumService) (new CglibProxy()).getProxy(ForumServiceImpl.class);
        //using proxy.removeForum
        String result = proxy.removeForum(101);
        String expected = "begin monitor...\n" +
                "remove forum:101\n" +
                "end record...\n";
        Assert.assertEquals(expected, result);
        //using proxy.removeTopic
        result = proxy.removeTopic(202);
        expected = "begin monitor...\n" +
                "remove topic:202\n" +
                "end record...\n";
        Assert.assertEquals(expected, result);
    }
}