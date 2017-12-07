/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Benz.java
 * Date : 17-12-6 下午10:53
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

public class Benz extends CarModel {
    @Override
    public String alarm() {
        return "Benz alarmed.";
    }

    @Override
    public String engineBoom() {
        return "Benz engine boomed.";
    }

    @Override
    public String start() {
        return "Benz started.";
    }

    @Override
    public String stop() {
        return "Benz stoped.";
    }
}
