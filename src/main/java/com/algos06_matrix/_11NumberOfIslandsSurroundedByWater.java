package com.algos06_matrix;

public class _11NumberOfIslandsSurroundedByWater {
    private static boolean flag=true;
    public static void main(String[] args) {
        int [][] matrix = {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}};
        System.out.println(getClosedIslands(matrix,matrix.length,matrix[0].length));
    }

    private static int getClosedIslands(int[][] matrix, int m, int length) {
        int count=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    dfs(matrix,i,j);
                    if (flag)
                        count++;
                    flag=true;
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] matrix, int i, int j) {
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[i].length || matrix[i][j]==1)
            return;
        if((i==0 || j==0 || i==matrix.length-1 || j==matrix[0].length-1) && matrix[i][j]==0)
            flag = false;
        matrix[i][j]=1;
        dfs(matrix,i+1,j);
        dfs(matrix,i,j+1);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j-1);
    }
}
