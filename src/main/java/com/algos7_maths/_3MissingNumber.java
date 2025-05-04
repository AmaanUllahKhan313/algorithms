package com.algos7_maths;

public class _3MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int sum=0;
        for (int i :arr)
            sum+=i;
        //n(n-1)/2=sum of n numbers, difference is missing number
        System.out.println((arr.length*(arr.length+1))/2-sum);
    }
}
