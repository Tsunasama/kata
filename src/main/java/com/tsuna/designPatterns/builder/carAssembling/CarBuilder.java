/*
 * Copyright (c) 2017.
 * Project : kata
 * File : CarBuilder.java
 * Date : 17-12-6 下午11:07
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.carAssembling;

import java.util.List;

abstract class CarBuilder {
    abstract void setSequence(List<String> sequence);

    abstract CarModel getCar();
}
