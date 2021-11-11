package com.algos.arrays;

import java.util.stream.Stream;

public class A1B1A2B2 {
    public static void main(String[] args) {
        String [] arr = {"A1","A2","A3","A4","B1","B2","B3","B4"};
        getArrangedArray(arr);
      Stream.of(arr).forEach(System.out::print);
    }

    private static void getArrangedArray(String[] arr) {
        getShuffledArray(arr,0,arr.length-1);
    }

    private static void getShuffledArray(String[] arr, int start, int end) {
        if (start > end)
            return;
        if (end - start == 1)
            return;
        int mid=(start+end)/2;
        int temp = mid + 1;
        int mmid = (start + mid) / 2;
        for (int i = mmid+1; i <= mid; i++) {
            String temp1 = arr[i];
            arr[i] = arr[temp];
            arr[temp++] = temp1;
        }
        getShuffledArray(arr,start,mid);
        getShuffledArray(arr,mid+1,end);
    }

}
