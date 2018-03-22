/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ForumService.java
 * Date : 18-3-22 上午6:54
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.proxy.dynamicProxy;

public interface ForumService {
    String removeTopic(int id);

    String removeForum(int id);
}
