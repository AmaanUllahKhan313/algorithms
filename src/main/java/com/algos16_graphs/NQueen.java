package com.algos16_graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> board = new ArrayList<>();
        nQueens(n,0, new ArrayList<>(),board);
        board.stream().map(Arrays::asList).forEach(System.out::println);
    }
    private static void nQueens(int n, int row, List<Integer> col, List<List<Integer>> board) {
        if (row==n)
            board.add(new ArrayList<>(col));
        else {
            for (int i = 0; i <= n; i++) {
                col.add(i);
                if (isValid(col))
                    nQueens(n, row + 1, col, board);
                else
                    col.remove(col.size() - 1);
            }
        }
    }
    private static boolean isValid(List<Integer> col) {
        int current = col.size()-1;
        for (int i = 0; i < current; i++) {
            int difference = Math.abs(col.get(i)-col.get(current));
            if (difference==0 || difference==current-i)
                return false;
        }
        return true;
    }
}
