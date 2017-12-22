/*
 * Copyright (c) 2017.
 * Project : kata
 * File : NvWa.java
 * Date : 17-12-22 上午9:03
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.singletonFactory;

public class NvWa {
    public static void main(String... args) {
        System.out.println("--Make White human--");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        System.out.println(whiteHuman.getColor());
        System.out.println(whiteHuman.talk());
        System.out.println("--Make Black human--");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        System.out.println(blackHuman.getColor());
        System.out.println(blackHuman.talk());
        System.out.println("--Make Yellow human--");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        System.out.println(yellowHuman.getColor());
        System.out.println(yellowHuman.talk());
    }
}
