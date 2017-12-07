/*
 * Copyright (c) 2017.
 * Project : kata
 * File : BMW.java
 * Date : 17-12-6 下午11:05
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

class BMW extends CarModel {
    @Override
    String alarm() {
        return "BMW alarmed.";
    }

    @Override
    String engineBoom() {
        return "BMW engine boomed.";
    }

    @Override
    String start() {
        return "BMW started.";
    }

    @Override
    String stop() {
        return "BMW stoped.";
    }
}
