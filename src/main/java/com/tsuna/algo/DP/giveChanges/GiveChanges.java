/*
 * Copyright (c) 2017.
 * Project : kata
 * File : giveChange.java
 * Date : 17-12-4 下午8:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.DP.giveChanges;

/**
 * Now we have money of face value {50,25,10,5,1}
 * Give you an amount of money total is "s"
 * Question:How many kinds of way can we choose to change
 */
class GiveChanges {
    private static final int[] faceValue = new int[]{0, 1, 5, 10, 25, 50};
    private int amount;
    private int[][] solutions;//solution matrix

    GiveChanges() {
    }

    /**
     * Change a certain amount of money using anterior kinds of money
     *
     * @param anteriorKinds:the number of face value to choose
     * @param amount:the        amount of money to change
     */
    private void solve(int anteriorKinds, int amount) {
        //when amount is 0,each kinds of face value of money chosen 0
        if (amount == 0) {
            solutions[anteriorKinds][amount] = 1;
            return;
        }
        //when choose no kinds of money,solution is also 0
        if (anteriorKinds == 0) {
            solutions[anteriorKinds][amount] = 0;
            return;
        }
        //Initilize default solution amount
        solutions[anteriorKinds][amount] = 0;
        //Max amount to choose with the max face value
        int maxCount = amount / faceValue[anteriorKinds];
        for (int i = 0; i <= maxCount; i++) {
            //Compute solution
            solutions[anteriorKinds][amount] += solutions[anteriorKinds - 1][amount - faceValue[anteriorKinds] * i];
        }
    }

    //Solve the question
    private void solveAll() {
        for (int i = 0; i < faceValue.length; i++) {
            for (int j = 0; j <= amount; j++) {
                solve(i, j);
            }
        }
    }

    //Get solution
    private int solve() {
        solveAll();
        return solutions[faceValue.length - 1][amount];
    }

    int getSolution(int amount) {
        if (amount < 1)
            return -1;
        //Set context
        solutions = new int[faceValue.length][amount + 1];
        this.amount = amount;
        return solve();
    }
}
