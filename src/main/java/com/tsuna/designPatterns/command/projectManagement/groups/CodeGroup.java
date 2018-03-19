/*
 * Copyright (c) 2018.
 * Project : kata
 * File : CodeGroup.java
 * Date : 18-3-19 下午2:09
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.groups;

public class CodeGroup implements Group {
    @Override
    public String find() {
        return "Find code group.\n";
    }

    @Override
    public String add() {
        return "Add code segment.\n";
    }

    @Override
    public String delete() {
        return "Delete code segment.\n";
    }

    @Override
    public String change() {
        return "Change code segment.\n";
    }

    @Override
    public String plan() {
        return "Add new code plan.\n";
    }
}
