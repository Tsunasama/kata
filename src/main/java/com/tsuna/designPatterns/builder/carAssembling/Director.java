/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Director.java
 * Date : 17-12-7 下午2:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

import java.util.ArrayList;
import java.util.List;

class Director {
    private List<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    Benz getBenzAModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (Benz) benzBuilder.getCar();
    }

    Benz getBenzBModel() {
        sequence.clear();
        sequence.add("engineBoom");
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (Benz) benzBuilder.getCar();
    }

    BMW getBmwAModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BMW) bmwBuilder.getCar();
    }

    BMW getBmwBModel() {
        sequence.clear();
        sequence.add("engineBoom");
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BMW) bmwBuilder.getCar();
    }
}
