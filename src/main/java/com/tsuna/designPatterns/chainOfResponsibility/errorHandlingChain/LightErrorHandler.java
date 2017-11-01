/*
 * Copyright (c) 2017.
 * Project : kata
 * File : LightErrorHandler.java
 * Date : 17-10-31 下午9:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

public class LightErrorHandler extends ErrorHandler {
    LightErrorHandler(ErrorRank rank) {
        super(rank);
    }

    @Override
    public String handle(ErrorBase error) {
        return error.toString() + " handled by light error handler.";
    }
}
