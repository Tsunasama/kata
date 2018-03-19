/*
 * Copyright (c) 2018.
 * Project : kata
 * File : AddRequirementCommand.java
 * Date : 18-3-19 下午2:14
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.commands;

public class AddRequirementCommand extends CommandBase {
    @Override
    public String execute() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.requirementGroup.find());
        builder.append(super.requirementGroup.add());
        builder.append(super.requirementGroup.plan());
        return builder.toString();
    }
}
