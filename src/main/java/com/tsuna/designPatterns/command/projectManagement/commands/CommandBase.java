/*
 * Copyright (c) 2018.
 * Project : kata
 * File : CommandBase.java
 * Date : 18-3-19 下午2:11
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement.commands;

import com.tsuna.designPatterns.command.projectManagement.groups.CodeGroup;
import com.tsuna.designPatterns.command.projectManagement.groups.PageGroup;
import com.tsuna.designPatterns.command.projectManagement.groups.RequirementGroup;

/**
 * Comprises the real implementation of groups and assign concret assignment to different groups
 */
public abstract class CommandBase {
    CodeGroup codeGroup = new CodeGroup();
    PageGroup pageGroup = new PageGroup();
    RequirementGroup requirementGroup = new RequirementGroup();

    public abstract String execute();
}
