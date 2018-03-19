/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Group.java
 * Date : 18-3-19 下午2:02
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.groups;

public interface Group {
    String find();

    String add();

    String delete();

    String change();

    String plan();
}
