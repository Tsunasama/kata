/*
 * Copyright (c) 2017.
 * Project : kata
 * File : NvWa.java
 * Date : 17-12-22 上午11:39
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.abstractFactory;

import static java.lang.System.out;

public class NvWa {
    public static void main(String... args) {
        out.println("***** Start making males *****");
        MaleFactory maleFactory = new MaleFactory();
        out.println("--Make white human--");
        Human whiteHuman = maleFactory.createWhiteHuman();
        out.println(whiteHuman.getColor());
        out.println(whiteHuman.talk());
        out.println(whiteHuman.getSex());
        out.println("--Make yellow human--");
        Human yellowHuman = maleFactory.createYellowHuman();
        out.println(yellowHuman.getColor());
        out.println(yellowHuman.talk());
        out.println(yellowHuman.getSex());
        out.println("--Make Black human--");
        Human blackHuman = maleFactory.createBlackHuman();
        out.println(blackHuman.getColor());
        out.println(blackHuman.talk());
        out.println(blackHuman.getSex());
        out.println("***** Start making females *****");
        FemaleFactory femaleFactory = new FemaleFactory();
        out.println("--Make white human--");
        whiteHuman = femaleFactory.createWhiteHuman();
        out.println(whiteHuman.getColor());
        out.println(whiteHuman.talk());
        out.println(whiteHuman.getSex());
        out.println("--Make yellow human--");
        yellowHuman = femaleFactory.createYellowHuman();
        out.println(yellowHuman.getColor());
        out.println(yellowHuman.talk());
        out.println(yellowHuman.getSex());
        out.println("--Make Black human--");
        blackHuman = femaleFactory.createBlackHuman();
        out.println(blackHuman.getColor());
        out.println(blackHuman.talk());
        out.println(blackHuman.getSex());
    }
}
