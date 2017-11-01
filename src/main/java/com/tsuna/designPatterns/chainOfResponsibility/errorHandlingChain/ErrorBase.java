/*
 * Copyright (c) 2017.
 * Project : kata
 * File : IError.java
 * Date : 17-10-31 下午9:34
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

public class ErrorBase {
    private ErrorRank rank;

    ErrorBase(ErrorRank rank) {
        this.rank = rank;
    }

    ErrorRank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Error:" + rank.toString();
    }
}
