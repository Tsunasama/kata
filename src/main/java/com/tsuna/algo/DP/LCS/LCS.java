/*
 * Copyright (c) 2017.
 * Project : kata
 * File : LCS.java
 * Date : 17-12-10 上午7:36
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.DP.LCS;

import java.util.ArrayList;
import java.util.List;

class LCS {
    //input sequences
    private char[] seq1;
    private char[] seq2;
    //result matrix
    private LCSElement[][] results;

    LCS(char[] seq1, char[] seq2) {
        this.seq1 = seq1;
        this.seq2 = seq2;
        results = new LCSElement[seq1.length + 1][seq2.length + 1];
    }

    /**
     * Solve question of [i,j] and save
     *
     * @param i:sequence 1 from 1st to ith
     * @param j:sequence 2 from 1st to jth
     */
    private void solve(int i, int j) {
        if (i == 0 && j == 0) {
            results[i][j] = new LCSElement(0, new ArrayList<>());
            return;
        }
        if (i == 0) {
            results[i][j] = results[i][j - 1];
            return;
        }
        if (j == 0) {
            results[i][j] = results[i - 1][j];
            return;
        }
        if (seq1[i - 1] == seq2[j - 1]) {
            List<Character> newEles = new ArrayList<>();
            //make a new result LCSElelement to store mediate result
            newEles.addAll(results[i - 1][j - 1].getEles());
            newEles.add(seq1[i - 1]);
            LCSElement lcsElement = new LCSElement(results[i][j - 1].getMatching() + 1, newEles);
            results[i][j] = lcsElement;
        } else {
            if (results[i][j - 1].getMatching() >= results[i - 1][j].getMatching()) {
                results[i][j] = results[i][j - 1];
            } else {
                results[i][j] = results[i - 1][j];
            }
        }
    }

    void solveAll() {
        for (int j = 0; j < seq2.length + 1; j++) {
            for (int i = 0; i < seq1.length + 1; i++) {
                solve(i, j);
            }
        }
    }

    LCSElement getSolution() {
        return results[seq1.length][seq2.length];
    }

    /**
     * Get the LCS of sequence 1 and sequence 2 with their subsequence
     *
     * @param ordinal1:the index to which sequence 1 splited
     * @param ordinal2:the index to whick sequence 2 splited
     * @return : result LCSElement
     */
    LCSElement getSolution(int ordinal1, int ordinal2) {
        if (ordinal1 > seq1.length)
            throw new ArrayIndexOutOfBoundsException("'getSolution(int,int)'parameter out of bounds");
        if (ordinal2 > seq2.length)
            throw new ArrayIndexOutOfBoundsException("'getSolution(int,int)'parameter out of bounds");
        if (ordinal1 < 0 || ordinal2 < 0)
            throw new RuntimeException("index cannot less than 0");
        return results[ordinal1][ordinal2];
    }
}
