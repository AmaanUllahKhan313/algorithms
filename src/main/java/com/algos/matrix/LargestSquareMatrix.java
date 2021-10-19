package com.algos.matrix;

public class LargestSquareMatrix {
    public static int minimum (int x, int y, int z) {
        return Integer.min(Integer.min(x, y), z);
    }

    public static int findLargestSquare(int[][] M){
        int max = 0;
        int[][] T = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[0].length; j++){
                T[i][j] = M[i][j];
                if (i > 0 && j > 0 && M[i][j] == 1){
                    T[i][j] = minimum(T[i][j - 1], T[i - 1][j],
                            T[i - 1][j - 1]) + 1;
                }
                max=Math.max(T[i][j],max);
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int mat[][] =
                {
                        { 0, 0, 1, 0, 1, 1 },
                        { 0, 1, 1, 1, 0, 0 },
                        { 0, 0, 1, 1, 1, 1 },
                        { 1, 1, 0, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 0, 1, 1, 1 },
                        { 1, 0, 1, 1, 1, 1 },
                        { 1, 1, 1, 0, 1, 1 }
                };

        System.out.print("The size of largest square submatrix of 1's is " +
                findLargestSquare(mat));
    }
}
