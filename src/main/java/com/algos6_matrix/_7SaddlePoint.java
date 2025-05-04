package com.algos6_matrix;

public class _7SaddlePoint {
    public static void main(String[] args){
        int mat[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(findSaddlePoint(mat));
    }

    private static int findSaddlePoint(int [] [] mat) {
        for (int i = 0; i < mat.length; i++) {
            int col_index = 0;
            int min = mat[i][0];
            for (int j = 0; j < mat[0].length; j++) {
                if (min > mat[i][j]) {
                    min = mat[i][j];
                    col_index = j;
                }
            }
            int k;
            for (k= 0; k < mat.length; k++) {
                if(min<mat[k][col_index]){
                    break;
                }
            }
            if (mat.length==k)
                return min;
        }
        return -1;
    }
}
