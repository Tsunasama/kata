/*
 * Copyright (c) 2018.
 * Project : kata
 * File : Director.java
 * Date : 18-4-20 上午10:39
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.builder.defination;

import com.tsuna.designPatterns.builder.defination.builder.Builder;
import com.tsuna.designPatterns.builder.defination.builder.ProductABuilder;
import com.tsuna.designPatterns.builder.defination.builder.ProductBBuilder;
import com.tsuna.designPatterns.builder.defination.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Arrange builders and get customized product
 */
public class Director {
    private final List<String> modelA;
    private final List<String> modelB;
    private Builder productABuilder = new ProductABuilder();
    private Builder productBBuilder = new ProductBBuilder();

    public Director() {
        modelA = new ArrayList<>();
        modelA.add("doActionA");
        modelA.add("doActionB");
        modelA.add("doActionC");
        modelB = new ArrayList<>();
        modelB.add("doActionC");
        modelB.add("doActionB");
        modelB.add("doActionA");
    }

    public Product getProductAModelA() {
        productABuilder.assemble(modelA);
        return productABuilder.getProduct();
    }

    public Product getProductAModelB() {
        productABuilder.assemble(modelB);
        return productABuilder.getProduct();
    }

    public Product getProductBModelA() {
        productBBuilder.assemble(modelA);
        return productBBuilder.getProduct();
    }

    public Product getProductBModelB() {
        productBBuilder.assemble(modelB);
        return productBBuilder.getProduct();
    }

}
