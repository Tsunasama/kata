/*
 * Copyright (c) 2017.
 * Project : kata
 * File : SevereErrorHandler.java
 * Date : 17-10-31 下午9:51
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

public class SevereErrorHandler extends ErrorHandler {
    SevereErrorHandler(ErrorRank rank) {
        super(rank);
    }

    @Override
    public String handle(ErrorBase error) {
        return error.toString() + " handled by severe error handler.";
    }
}
