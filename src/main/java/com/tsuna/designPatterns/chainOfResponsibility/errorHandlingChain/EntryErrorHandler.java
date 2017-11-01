/*
 * Copyright (c) 2017.
 * Project : kata
 * File : EntryErrorHandler.java
 * Date : 17-11-1 上午9:36
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

public final class EntryErrorHandler extends ErrorHandler {

    public EntryErrorHandler(ErrorRank rank) {
        super(ErrorRank.ENTRY);
    }

    EntryErrorHandler() {
        super(ErrorRank.ENTRY);
    }

    @Override
    public String handle(ErrorBase error) {
        return null;
    }
}
