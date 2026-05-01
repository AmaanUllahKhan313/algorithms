package com.algos15_dynamicprogramming;

public class _15CoinChangeMinCoins {
    public static void main(String[] args) {
        int[] coins = {1,5,2};
        int amount = 3;
        System.out.println(getCoinChange(amount,coins));
    }
    public static int getCoinChange(int amount,int[] coins) {
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            dp[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= amount; i++){
            for (int j = 0; j < coins.length; j++)
                if (coins[j] <= i){
                        dp[i] = Math.min(1+dp[i - coins[j]],dp[i]);
                }
        }
        if(dp[amount]==Integer.MAX_VALUE)
            return -1;
        return dp[amount];
    }
}
