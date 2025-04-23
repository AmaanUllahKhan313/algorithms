package com.algos7_maths;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int sum=0;
        for (int i :arr)
            sum+=i;
        System.out.println((arr.length*(arr.length+1))/2-sum);
    }
}
