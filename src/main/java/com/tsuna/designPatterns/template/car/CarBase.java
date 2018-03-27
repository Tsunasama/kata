/*
 * Copyright (c) 2018.
 * Project : kata
 * File : CarBase.java
 * Date : 18-3-27 下午12:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.template.car;

/**
 * This class represents a template class which implements the show()
 * template method and make concret implementation to subclasses
 */
public abstract class CarBase implements ICar {
    @Override
    public final String show() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.start());
        builder.append(this.alarm());
        builder.append(this.engineBoom());
        builder.append(this.stop());
        return builder.toString();
    }
}
