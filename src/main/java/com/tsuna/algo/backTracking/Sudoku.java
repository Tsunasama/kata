package com.tsuna.algo.backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sudoku {
    public boolean solveSudoku(char[][] board) {
        return backTracking(board, 0);
    }

    private boolean backTracking(char[][] board, int row) {
        int[] nextCell = findNextCell(board, row);
        if (nextCell == null) {
            return true;
        }

        int nextRow = nextCell[0];
        int nextCol = nextCell[1];
        for (int i = 1; i <= 9; i++) {
            if (!checkValid(board, nextRow, nextCol, (char) ('0' + i))) {
                continue;
            }

            board[nextRow][nextCol] = (char) ('0' + i);
            boolean trackResult = backTracking(board, nextRow);
            if (trackResult) {
                return true;
            }
            board[nextRow][nextCol] = '.';
        }

        return false;
    }

    private int[] findNextCell(char[][] board, int row) {
        for (int i = row; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    private boolean checkValid(char[][] board, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val) {
                return false;
            }
        }


        for (int i = row / 3 * 3; i < (row / 3 + 1) * 3; i++) {
            for (int j = col / 3 * 3; j < (col / 3 + 1) * 3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '7', '1', '6', '2', '5'},
                {'.', '4', '.', '.', '.', '.', '3', '.', '.'},
                {'.', '2', '.', '.', '.', '.', '.', '4', '.'},
                {'6', '1', '.', '.', '.', '.', '.', '.', '2'},
                {'2', '.', '.', '5', '.', '7', '.', '.', '.'},
                {'.', '.', '5', '.', '.', '2', '.', '.', '9'},
                {'9', '.', '.', '.', '.', '.', '5', '.', '1'},
                {'.', '.', '.', '3', '.', '4', '2', '.', '.'},
                {'.', '6', '.', '.', '.', '9', '.', '.', '4'}
        };
//        char[][] board = {
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
//        };

        Sudoku s = new Sudoku();
        boolean resolved = s.solveSudoku(board);
        if (!resolved) {
            System.out.println("No solution found");
            return;
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(String.copyValueOf(board[i]));
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
