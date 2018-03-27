/*
 * Copyright (c) 2018.
 * Project : kata
 * File : BYD.java
 * Date : 18-3-27 下午12:55
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.template.car;

public class BYD extends CarBase {
    @Override
    public String start() {
        return "BYD starts\n";
    }

    @Override
    public String stop() {
        return "BYD stops\n";
    }

    @Override
    public String alarm() {
        return "BYD alarms\n";
    }

    @Override
    public String engineBoom() {
        return "BYD's engine booms\n";
    }
}
