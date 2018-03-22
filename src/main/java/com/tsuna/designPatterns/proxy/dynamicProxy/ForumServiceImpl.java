/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ForumServiceImpl.java
 * Date : 18-3-22 上午6:55
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

public class ForumServiceImpl implements ForumService {
    @Override
    public String removeTopic(int id) {
        return "remove topic:" + id + "\n";
    }

    @Override
    public String removeForum(int id) {
        return "remove forum:" + id + "\n";
    }
}
