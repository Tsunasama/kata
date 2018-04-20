/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ProductABuilder.java
 * Date : 18-4-20 上午10:41
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination.builder;

import com.tsuna.designPatterns.builder.defination.product.Product;
import com.tsuna.designPatterns.builder.defination.product.RealProductA;

public class ProductABuilder extends Builder {
    @Override
    public Product getProduct() {
        RealProductA productA = new RealProductA();
        productA.assemble(sequence);
        return productA;
    }
}
