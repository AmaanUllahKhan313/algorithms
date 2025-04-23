package com.algos4_slidingwindow;

public class MaxProductOfSubArray {
    public static void main(String[] args) {
        System.out.println(getMaxProductSubArray(new int []{2,3,-2,4}));
    }
    private static int getMaxProductSubArray(int [] ints) {
        int prd1 = 1 ;
        int prd2 = 1;
        int max= Integer.MIN_VALUE;
        for (int i: ints) {
            int t1 = (prd1==0&&i!=0?1:prd1) * i;
            int t2 = (prd2==0&&i!=0?1:prd2) * i;
            prd1 = Math.max(i,Math.max(t1,t2));
            prd2 = Math.min(i,Math.min(t1,t2));
            max = Math.max(max,prd1);
        }
        return max;
    }
}