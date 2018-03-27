/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Audi.java
 * Date : 18-3-27 下午12:54
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.template.car;

public class Audi extends CarBase {
    @Override
    public String start() {
        return "Audi starts\n";
    }

    @Override
    public String stop() {
        return "Audi stops\n";
    }

    @Override
    public String alarm() {
        return "Audi alarms\n";
    }

    @Override
    public String engineBoom() {
        return "Audi's engine booms\n";
    }
}
