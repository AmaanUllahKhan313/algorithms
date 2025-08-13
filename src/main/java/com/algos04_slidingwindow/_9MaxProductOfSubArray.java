package com.algos04_slidingwindow;

public class _9MaxProductOfSubArray {
    public static void main(String[] args) {
        System.out.println(getMaxProductSubArray(new int []{-2,0,-1}));
    }
    //KADANES algo for product
    private static int getMaxProductSubArray(int [] ints) {
        int n = ints.length, res = ints[0], left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            left =  (left == 0 ? 1 : left) * ints[i];
            right =  (right == 0 ? 1 : right) * ints[n - 1 - i];
            res = Math.max(res, Math.max(left, right));
        }
        return res;
    }
}