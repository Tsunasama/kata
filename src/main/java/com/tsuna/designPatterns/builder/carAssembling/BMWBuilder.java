/*
 * Copyright (c) 2017.
 * Project : kata
 * File : BMWBuilder.java
 * Date : 17-12-7 下午2:46
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

import java.util.List;

class BMWBuilder extends CarBuilder {
    private CarModel BMW = new BMW();

    @Override
    void setSequence(List<String> sequence) {
        BMW.setSequence(sequence);
    }

    @Override
    CarModel getCar() {
        return BMW;
    }
}
