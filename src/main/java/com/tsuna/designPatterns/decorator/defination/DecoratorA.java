/*
 * Copyright (c) 2018.
 * Project : kata
 * File : DecoratorA.java
 * Date : 18-4-2 上午10:56
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.decorator.defination;

public class DecoratorA extends Decorator {
    public DecoratorA(Component decoratedComponent) {
        super(decoratedComponent);
    }

    //decorate logic(local logic)
    private String decorateMethod() {
        return "Do decorate operation in decorator A\n";
    }

    //weave decorate logic into interface
    @Override
    public String operate() {
        return this.decorateMethod() + super.operate();
    }
}
