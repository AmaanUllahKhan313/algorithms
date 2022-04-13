package com.algos.arrays;

public class ProdOfAllExceptSelf {
    public static void main(String[] args) {
        int  [] nums =new int[] {-1,1,0,-3,3};
        int n = nums.length;
        int[] res = new int[n];
        int right=1,left=1;
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for (int i=0;i<n;i++) {
            res[i]*=left;
            left*=nums[i];
        }
        for(int i=n-1;i>=0;i--) {
            res[i]*=right;
            right*=nums[i];
        }
        for (int n1: res) {
            System.out.println(n1);
        }
    }
}
