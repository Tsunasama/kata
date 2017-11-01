/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ErrorRank.java
 * Date : 17-10-31 下午9:27
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

public enum ErrorRank {
    ENTRY(0), SLIGHT(1), MIDDLE(2), SEVERE(3), UNKNOWN(4);
    private int ranking;

    ErrorRank(int i) {
        ranking = i;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public int getRanking() {
        return ranking;
    }
}
