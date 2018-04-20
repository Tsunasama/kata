/*
 * Copyright (c) 2018.
 * Project : kata
 * File : RealProductA.java
 * Date : 18-4-20 上午10:42
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination.product;

public class RealProductA extends Product {
    @Override
    String doActionA() {
        return "RealProductA do Action 'A'\n";
    }

    @Override
    String doActionB() {
        return "RealProductA do Action 'B'\n";
    }

    @Override
    String doActionC() {
        return "RealProductA do Action 'C'\n";
    }
}
