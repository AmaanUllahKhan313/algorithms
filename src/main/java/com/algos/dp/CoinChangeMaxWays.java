package com.algos.dp;

public class CoinChangeMaxWays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int amount = 4;
        System.out.println(getCoinCombinations(a,amount));
    }
    private static int getCoinCombinations(int[] a, int sum) {
        int[][] t = new int[a.length+1][sum+1];
        for (int i = 0; i <= a.length; i++)
            t[i][0] = 1;
        for (int i = 1; i <= sum; i++)
            t[0][i] = 0;

        for(int i = 1;i<=a.length;i++){
            for(int j= 1;j<=sum;j++){
                if(a[i-1]<=j){
                    t[i][j]=t[i][j-a[i-1]]+t[i-1][j];//i for unbounded knapsack adding self
                    //t[i][j]=t[i-1][j-a[i-1]]+t[i-1][j];//i-1 for bounded knapsack adding self
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        } for(int i =0;i<=a.length;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }
        return t[a.length][sum];
    }
}
