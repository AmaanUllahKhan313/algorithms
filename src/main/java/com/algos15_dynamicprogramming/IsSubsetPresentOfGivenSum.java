package com.algos15_dynamicprogramming;

public class IsSubsetPresentOfGivenSum {
    public static void main(String[] args) {
        System.out.println(getSubset(new int[]{5, 2, 8, 10, 3, 4},9));
    }
    public static boolean getSubset(int[] a, int sum) {
        boolean[][] result = new boolean[a.length+1][sum+1];
        for (int i = 0; i <= a.length; i++)
            result[i][0] = true;
        for (int i = 1; i <= sum; i++)
            result[0][i] = false;
        for(int i=1;i<=a.length;i++){
            for(int j=1;j<=sum;j++){
                if(a[i-1]<=j){
                    result[i][j] = result[i-1][j-a[i-1]] || result[i-1][j];
                }else{
                    result[i][j] = result[i-1][j];
                }
            }
        }
        return result[a.length][sum];
    }
}
