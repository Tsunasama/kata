/*
 * Copyright (c) 2018.
 * Project : kata
 * File : DecoratorB.java
 * Date : 18-4-2 上午10:56
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.decorator.defination;

public class DecoratorB extends Decorator {
    public DecoratorB(Component decoratedComponent) {
        super(decoratedComponent);
    }

    //a decorate logic
    private String decorateMethod() {
        return "Do docorate operation in decorator B\n";
    }

    //another decorate logic
    private String anotherDecorateMethod() {
        return "Do another decorate operation in decorator B\n";
    }

    //weave decorate logic into interface
    @Override
    public String operate() {
        return this.decorateMethod() + super.operate() + this.anotherDecorateMethod();
    }
}
