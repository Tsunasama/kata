/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ErrorHandler.java
 * Date : 17-10-31 下午9:31
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

abstract class ErrorHandler {
    private ErrorRank rank;
    private ErrorHandler nextHandler;

    ErrorHandler(ErrorRank rank) {
        this.rank = rank;
    }

    void setNextHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //Actual executed handle method
    abstract String handle(ErrorBase error);

    //Controller,deliver error to actual handle method
    final String handleError(ErrorBase error) {
        if (error.getRank().getRanking() == this.rank.getRanking())
            return handle(error);
        else if (nextHandler != null)
            return nextHandler.handleError(error);
        else
            return "No matching error handler!";
    }
}
