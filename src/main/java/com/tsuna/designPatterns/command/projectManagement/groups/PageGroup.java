/*
 * Copyright (c) 2018.
 * Project : kata
 * File : PageGroup.java
 * Date : 18-3-19 下午2:10
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.groups;

public class PageGroup implements Group {
    @Override
    public String find() {
        return "Find page group.\n";
    }

    @Override
    public String add() {
        return "Add a new page.\n";
    }

    @Override
    public String delete() {
        return "Delete a page.\n";
    }

    @Override
    public String change() {
        return "Change a page.\n";
    }

    @Override
    public String plan() {
        return "Add a new page plan.\n";
    }
}
