/*
 * Copyright (c) 2018.
 * Project : kata
 * File : RealProductB.java
 * Date : 18-4-20 上午10:42
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination.product;

public class RealProductB extends Product {
    @Override
    String doActionA() {
        return "RealProductB do Action 'A'\n";
    }

    @Override
    String doActionB() {
        return "RealProductB do Action 'B'\n";
    }

    @Override
    String doActionC() {
        return "RealProductB do Action 'C'\n";
    }
}
