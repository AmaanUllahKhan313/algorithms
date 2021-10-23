package com.algos.slidingwindow;

public class MaxSum {

    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {1,2,3,4,1,2,3},3));
    }
    static int maxSum(int arr[], int k){
        int max = 0;int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=i<k?arr[i]:arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }
}
