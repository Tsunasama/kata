/*
 * Copyright (c) 2017.
 * Project : kata
 * File : MaleFactory.java
 * Date : 17-12-22 上午11:38
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

public class MaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
