/*
 * Copyright (c) 2017.
 * Project : kata
 * File : LCSElement.java
 * Date : 17-12-10 上午7:36
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.DP.LCS;

import java.util.List;

public class LCSElement {
    int getMatching() {
        return matching;
    }

    public void setMatching(int matching) {
        this.matching = matching;
    }

    List<Character> getEles() {
        return eles;
    }

    public void setEles(List<Character> eles) {
        this.eles = eles;
    }

    private int matching;
    private List<Character> eles;

    LCSElement(int matching, List<Character> eles) {
        this.matching = matching;
        this.eles = eles;
    }
}
