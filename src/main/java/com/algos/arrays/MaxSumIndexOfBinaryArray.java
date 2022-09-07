package com.algos.arrays;

public class MaxSumIndexOfBinaryArray {
    public static void main(String[] args) {
        int arr [] =  {1, 0, 1, 1, 1, 0, 0};
        int max=0,sum;
        for (int i = 0; i < arr.length-1; i++) {
            sum=arr[i]==0?-1:1;
            for (int j = i+1; j < arr.length; j++) {
                sum+=arr[j]==0?-1:1;
                if(sum==0)
                    max=Math.max(j-i+1,max);
            }
        }
        System.out.println(max);
    }
}
