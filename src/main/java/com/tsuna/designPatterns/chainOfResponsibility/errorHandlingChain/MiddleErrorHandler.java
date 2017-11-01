/*
 * Copyright (c) 2017.
 * Project : kata
 * File : MiddleErrorHandler.java
 * Date : 17-10-31 下午9:50
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

public class MiddleErrorHandler extends ErrorHandler {
    MiddleErrorHandler(ErrorRank rank) {
        super(rank);
    }

    @Override
    public String handle(ErrorBase error) {
        return error.toString() + " handled by middle error handler.";
    }
}
