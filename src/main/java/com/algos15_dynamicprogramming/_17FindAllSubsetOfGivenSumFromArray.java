package com.algos15_dynamicprogramming;

public class _17FindAllSubsetOfGivenSumFromArray {
    public static void main(String[] args) {
        System.out.println("Number of subset count : "+getSubsetSumCount(new int[]{6, 2, 7, 8, 4, 1, 3, 5},8));
    }

    private static int getSubsetSumCount(int[] a, int sum) {
        int[][] t = new int[a.length+1][sum+1];
        for (int i = 0; i <= a.length; i++)
            t[i][0] = 1;
        for (int i = 1; i <= sum; i++)
            t[0][i] = 0;
        for(int i =1 ;i<=a.length;i++){
            for(int j = 1;j<=sum;j++){
                if(a[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i-1][j-a[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[a.length][sum];
    }
}
