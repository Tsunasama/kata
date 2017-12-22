/*
 * Copyright (c) 2017.
 * Project : kata
 * File : NvWa.java
 * Date : 17-12-21 上午9:26
 * Tsunasama All rights reserved.
 */

package com.tsuna.designPatterns.factory.simpleFactory;

import java.awt.*;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();
        System.out.println("--Make White human--");
        Human whiteHuman = YinYangLu.createHuman(WrongHuman.class);
        System.out.println(whiteHuman.getColor());
        System.out.println(whiteHuman.talk());
        System.out.println("--Make Black human--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        System.out.println(blackHuman.getColor());
        System.out.println(blackHuman.talk());
        System.out.println("--Make Yello human--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        System.out.println(yellowHuman.getColor());
        System.out.println(yellowHuman.talk());
    }
}
