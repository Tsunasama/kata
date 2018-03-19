/*
 * Copyright (c) 2018.
 * Project : kata
 * File : RequirementGroup.java
 * Date : 18-3-19 下午2:06
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.groups;

public class RequirementGroup implements Group {

    @Override
    public String find() {
        return "Find requirement group.\n";
    }

    @Override
    public String add() {
        return "Add an requirement plan.\n";
    }

    @Override
    public String delete() {
        return "Delete an requirement plan.\n";
    }

    @Override
    public String change() {
        return "Change an requirement plan.\n";
    }

    @Override
    public String plan() {
        return "Set up an plan timel\n";
    }
}
