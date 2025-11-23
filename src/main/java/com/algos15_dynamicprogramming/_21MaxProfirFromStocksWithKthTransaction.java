package com.algos15_dynamicprogramming;

public class _21MaxProfirFromStocksWithKthTransaction {
    public static void main(String[] args) {
        int transactions = 2;
        int[] stocksPrice = { 10, 22, 5, 75, 65, 80 };
        System.out.println("Maximum profit is: " +
                maxProfit(stocksPrice, transactions));
    }

    private static int maxProfit(int[] stocksPrice, int transactions) {
        int profit[] [] = new int[transactions+1] [stocksPrice.length+1];
        for (int i = 1; i <= transactions; i++) {
            for (int j = 1; j < stocksPrice.length; j++) {
                int maxProfit = 0;
                for (int k = 0; k < j; k++) {
                    int currentTrans = stocksPrice[j]-stocksPrice[k];
                    maxProfit = Math
                            .max(currentTrans+profit[i-1][k]
                                    ,maxProfit);
                    profit[i][j] = Math.max(maxProfit,profit[i][j-1]);
                }
            }
        }
        return profit[transactions][stocksPrice.length-1];
    }
}
