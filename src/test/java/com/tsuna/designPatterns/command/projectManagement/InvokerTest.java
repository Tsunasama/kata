/*
 * Copyright (c) 2018.
 * Project : kata
 * File : InvokerTest.java
 * Date : 18-3-19 下午2:23
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement;

import com.tsuna.designPatterns.command.projectManagement.commands.AddRequirementCommand;
import com.tsuna.designPatterns.command.projectManagement.commands.CommandBase;
import com.tsuna.designPatterns.command.projectManagement.commands.DeletePageCommand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvokerTest {
    private Invoker invoker;
    private CommandBase addRequirementCommand;
    private CommandBase deletePageCommand;

    @Before
    public void instanciate() {
        invoker = new Invoker();
        addRequirementCommand = new AddRequirementCommand();
        deletePageCommand = new DeletePageCommand();
    }

    @Test
    public void testAction() throws Exception {
        invoker.setCommand(addRequirementCommand);
        String addRequirementCommandResult = invoker.Action();
        String expectedResult = "Find requirement group.\n" +
                "Add an requirement plan.\n" +
                "Set up an plan timel\n";
        Assert.assertEquals(expectedResult, addRequirementCommandResult);
        invoker.setCommand(deletePageCommand);
        String deletePageCommandResult = invoker.Action();
        expectedResult = "Find page group.\n" +
                "Delete a page.\n" +
                "Add a new page plan.\n";
        Assert.assertEquals(expectedResult, deletePageCommandResult);

    }

}