package com.algos6_matrix;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}};
        System.out.println(numIslands(matrix));
    }
    public static int numIslands(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    clearRestOfLand(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void clearRestOfLand(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) return;

        grid[i][j] = 0;
        clearRestOfLand(grid, i+1, j);
        clearRestOfLand(grid, i-1, j);
        clearRestOfLand(grid, i, j+1);
        clearRestOfLand(grid, i, j-1);
        return;
    }
}