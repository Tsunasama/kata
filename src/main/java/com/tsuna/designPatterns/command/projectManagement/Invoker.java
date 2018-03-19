/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Invoker.java
 * Date : 18-3-19 下午2:20
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.command.projectManagement;

import com.tsuna.designPatterns.command.projectManagement.commands.CommandBase;

/**
 * It is the real executor without knowing the status of Groups
 */
class Invoker {
    private CommandBase command;

    void setCommand(CommandBase command) {
        this.command = command;
    }

    String Action() {
        return command.execute();
    }
}
