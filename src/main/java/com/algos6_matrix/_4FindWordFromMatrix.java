package com.algos6_matrix;

public class _4FindWordFromMatrix {
    public static void main(String[] args) {
        char[][] grid = {
                { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' }
        };
        System.out.println(wordSearch(grid, "GEEKS"));
    }
    private static String wordSearch(char[][] grid, String word) {
        String result = "";
        int[] xDirection = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] yDirection = { -1, 0, 1, -1, 1, -1, 0, 1 };
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if(grid[row][column] == word.charAt(0)){
                    for (int move = 0; move < 8; move++) {
                        int rowMove = row + xDirection[move], columnMove = column + yDirection[move];
                        for (int l = 1; l < word.length(); l++) {
                            if ((rowMove >= 0 && rowMove < grid.length && columnMove >=0 && columnMove < grid[0].length
                            && grid[rowMove][columnMove] == word.charAt(l)))
                            rowMove+=xDirection[move];
                            columnMove+=yDirection[move];
                        }
                        if(move==word.length())
                            result = "word found at : row="+ row + "and" + column;
                    }
                }
            }
        }
        return result;
    }
}
