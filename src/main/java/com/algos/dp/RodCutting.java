package com.algos.dp;

public class RodCutting {
    public static void main(String[] args) {
        int[] cuts = {1, 2, 3, 4, 5, 6, 7, 8};
        int rod = 5;
        System.out.println("All cuts: "+getCountOfAllPossibleCutsOfRod(rod,cuts));
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int maxProfit = getMaxProfitFromGivenCutsPrices(rod,cuts,price);
        System.out.println("Max profit:"+maxProfit);
    }
    public static int getMaxProfitFromGivenCutsPrices(int rod,int[] cuts, int[] price) {
        int[][] t = new int[cuts.length+1][rod+1];
        for(int i = 1;i<=cuts.length;i++){
            for(int j=1;j<=rod;j++){
                if(cuts[i-1]<=j){
                    t[i][j] = Math.max(price[i-1] + t[i][j-cuts[i-1]],t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[cuts.length][rod];
    }
    public static int getCountOfAllPossibleCutsOfRod(int rod,int[] cuts) {
        int[][] t = new int[cuts.length+1][rod+1];
        for (int i = 0; i <= cuts.length; i++)
            t[i][0] = 1;
        for (int i = 0; i <= rod; i++)
            t[0][i] = 0;
        for(int i = 1;i<=cuts.length;i++){
            for(int j=1;j<=rod;j++){
                if(cuts[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i][j-cuts[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[cuts.length][rod];
    }
}
