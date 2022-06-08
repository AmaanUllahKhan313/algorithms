package com.algos.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A1B1A2B2 {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,4,3};
        IntStream.of(getArrangedArray(arr)).forEach(System.out::print);
    }
    private static int [] getArrangedArray(int [] nums) {
        int n = nums.length/2;
        for(int i=0;i<2*n;i=i+2){
            int temp=nums[i/2+n];
            int j;
            for( j=i/2+n;j>i+1;j--){
                nums[j]=nums[j-1];
            }
            nums[j]=temp;
        }
        return nums;
    }
}
