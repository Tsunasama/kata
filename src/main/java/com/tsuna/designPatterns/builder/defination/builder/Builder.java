/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Builder.java
 * Date : 18-4-20 上午10:41
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination.builder;

import com.tsuna.designPatterns.builder.defination.product.Product;

import java.util.List;

/**
 * Represents general builder which can customize the order sequence
 * and return the assembled product
 */
public abstract class Builder {
    protected List<String> sequence;

    public void assemble(List<String> order) {
        this.sequence = order;
    }

    /**
     * Using the customized {@link this.sequence} to build and get the product
     *
     * @return customized product
     */
    public abstract Product getProduct();
}
