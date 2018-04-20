/*
 * Copyright (c) 2018.
 * Project : kata
 * File : ProductBBuilder.java
 * Date : 18-4-20 上午10:41
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination.builder;

import com.tsuna.designPatterns.builder.defination.product.Product;
import com.tsuna.designPatterns.builder.defination.product.RealProductB;

public class ProductBBuilder extends Builder {
    @Override
    public Product getProduct() {
        RealProductB productB = new RealProductB();
        productB.assemble(sequence);
        return productB;
    }
}
