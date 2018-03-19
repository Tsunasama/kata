/*
 * Copyright (c) 2018.
 * Project : kata
 * File : DeletePageCommand.java
 * Date : 18-3-19 下午2:16
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.commands;

public class DeletePageCommand extends CommandBase {
    @Override
    public String execute() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.pageGroup.find());
        builder.append(super.pageGroup.delete());
        builder.append(super.pageGroup.plan());
        return builder.toString();
    }
}
