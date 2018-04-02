/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ConcretComponent.java
 * Date : 18-4-2 上午10:51
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.decorator.defination;

public class ConcretComponent implements Component {
    @Override
    public String operate() {
        return "Do operation in concret component.\n";
    }
}
