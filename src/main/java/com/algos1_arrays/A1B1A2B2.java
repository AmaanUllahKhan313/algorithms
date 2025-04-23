package com.algos1_arrays;

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
    private static void getShuffledArray(int [] arr) {
        getShuffledArray(arr,0,arr.length-1);
    }

    private static void getShuffledArray(int [] arr, int start, int end) {
        if (start > end)
            return;
        if (end - start == 1)
            return;
        int mid=(start+end)/2;
        int temp = mid + 1;
        int mmid = (start + mid) / 2;
        for (int i = mmid+1; i <= mid; i++) {
            int  temp1 = arr[i];
            arr[i] = arr[temp];
            arr[temp++] = temp1;
        }
        getShuffledArray(arr,start,mid);
        getShuffledArray(arr,mid+1,end);
    }
}
