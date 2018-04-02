/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Decorator.java
 * Date : 18-4-2 上午10:51
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.decorator.defination;

/**
 * This class is the base class of all common decorators which is also
 * a special component and can do decorator works
 */
public abstract class Decorator implements Component {
    //Decorated component
    private Component decoratedComponent;

    Decorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public String operate() {
        return decoratedComponent.operate();
    }
}
