package com.algos1_arrays;

import java.util.Arrays;

public class ProdOfAllExceptSelf {
    public static void main(String[] args) {
        int  [] nums =new int[] {-1,1,0,-3,3};
        int[] res = new int[nums.length];
        int right=1,left=1;
        Arrays.fill(res,1);
        for (int i=0;i<nums.length;i++) {
            res[i]*=left;
            left*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--) {
            res[i]*=right;
            right*=nums[i];
        }
        Arrays.stream(res).forEach(System.out::println);
    }
}
