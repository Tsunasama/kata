/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ICar.java
 * Date : 17-12-6 下午10:50
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

import java.util.List;

abstract class CarModel {
    private List<String> sequence;

    abstract String alarm();

    abstract String engineBoom();

    abstract String start();

    abstract String stop();

    final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    final String run() {
        StringBuilder result = new StringBuilder();
        for (String order : sequence) {
            if (order.equalsIgnoreCase("alarm"))
                result.append(alarm()).append("\n");
            else if (order.equalsIgnoreCase("engineBoom"))
                result.append(engineBoom()).append("\n");
            else if (order.equalsIgnoreCase("start"))
                result.append(start()).append("\n");
            else if (order.equalsIgnoreCase("stop"))
                result.append(stop()).append("\n");
        }
        return result.toString();
    }
}
