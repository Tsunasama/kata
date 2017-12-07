/*
 * Copyright (c) 2017.
 * Project : kata
 * File : BenzBuilder.java
 * Date : 17-12-6 下午11:10
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

import java.util.List;

class BenzBuilder extends CarBuilder {
    private CarModel benz = new Benz();

    @Override
    void setSequence(List<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    CarModel getCar() {
        return benz;
    }
}
