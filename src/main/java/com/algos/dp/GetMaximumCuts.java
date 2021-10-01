package com.algos.dp;

public class GetMaximumCuts {

    public static void main(String[] args) {

        int arr []  = {11,2,3};
        int maxCutSize = 25;
        getMaxCuts(arr,maxCutSize);
        System.out.println();
    }
    private static int getMaxCuts(int[] arr, int maxCutSize) {
        int out [] [] = new int[arr.length] [maxCutSize];

        for (int i = 1; i < arr.length ; i++) {
            for (int j = 1; j < maxCutSize ; j++) {
                out [i] [j] = Math.max(out [i] [j-1] , out [i-1] [j])+1;
            }
        }
        return out [arr.length] [maxCutSize] ;
    }
}
