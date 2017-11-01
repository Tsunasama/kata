/*
 * Copyright (c) 2017.
 * Project : kata
 * File : ErrorHandlerTest.java
 * Date : 17-10-31 下午9:53
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.chainOfResponsibility.errorHandlingChain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ErrorHandlersTest {
    private EntryErrorHandler entryErrorHandler;
    private LightErrorHandler lightErrorHandler;
    private MiddleErrorHandler middleErrorHandler;
    private SevereErrorHandler severeErrorHandler;
    private ErrorBase lightError;
    private ErrorBase middleEror;
    private ErrorBase severeError;
    private ErrorBase unhandledError;

    @Before
    public void initialize() {
        //initialize objects
        entryErrorHandler = new EntryErrorHandler();
        lightErrorHandler = new LightErrorHandler(ErrorRank.SLIGHT);
        middleErrorHandler = new MiddleErrorHandler(ErrorRank.MIDDLE);
        severeErrorHandler = new SevereErrorHandler(ErrorRank.SEVERE);
        lightError = new ErrorBase(ErrorRank.SLIGHT);
        middleEror = new ErrorBase(ErrorRank.MIDDLE);
        severeError = new ErrorBase(ErrorRank.SEVERE);
        unhandledError = new ErrorBase(ErrorRank.UNKNOWN);

        //build the responsiblity chain
        entryErrorHandler.setNextHandler(lightErrorHandler);
        lightErrorHandler.setNextHandler(middleErrorHandler);
        middleErrorHandler.setNextHandler(severeErrorHandler);
    }

    @Test
    public void testErrorHandler() {
        String lightMessage = entryErrorHandler.handleError(lightError);
        String middleMessage = entryErrorHandler.handleError(middleEror);
        String severeMessage = entryErrorHandler.handleError(severeError);
        String unhandledMessage = entryErrorHandler.handleError(unhandledError);
        Assert.assertEquals("Error:SLIGHT handled by light error handler.", lightMessage);
        Assert.assertEquals("Error:MIDDLE handled by middle error handler.", middleMessage);
        Assert.assertEquals("Error:SEVERE handled by severe error handler.", severeMessage);
        Assert.assertEquals("No matching error handler!", unhandledMessage);
    }
}