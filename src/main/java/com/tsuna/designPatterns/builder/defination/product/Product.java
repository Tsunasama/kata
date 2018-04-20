/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Product.java
 * Date : 18-4-20 上午10:42
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination.product;

import java.util.List;

/**
 * Represents general products.
 * Make the assemble of product a template method.
 */
public abstract class Product {
    private List<String> sequence;

    abstract String doActionA();

    abstract String doActionB();

    abstract String doActionC();

    /**
     * Setup the action sequence of product
     *
     * @param sequence the order of action
     */
    public final void assemble(List<String> sequence) {
        this.sequence = sequence;
    }

    /**
     * Make the product work in the order of assembled sequence
     *
     * @return work sequence of product
     */
    public final String run() {
        if (sequence == null)
            return "";
        StringBuilder resultBuilder = new StringBuilder();
        for (String action : sequence) {
            switch (action) {
                case "doActionA":
                    resultBuilder.append(doActionA());
                    break;
                case "doActionB":
                    resultBuilder.append(doActionB());
                    break;
                case "doActionC":
                    resultBuilder.append(doActionC());
                    break;
            }
        }
        return resultBuilder.toString();
    }
}
