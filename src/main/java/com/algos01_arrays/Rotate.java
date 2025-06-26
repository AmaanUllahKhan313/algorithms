package com.algos01_arrays;

public class Rotate {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        if(a.length > 100000) return;
        System.out.println("Before rotation");
        for (int n:a) {
            System.out.print(n+"\t");
            if(n>1000000)return;
        }

        a = rightRotate(a,2);
        if(a == null)return;
        System.out.println("After rotation ");
        for (int n:a) {
            System.out.print(n+"\t");
        }
    }

    private static int[] leftRotate(int[] a, int r) {
        if(r>a.length)return null;
        for(int i=0;i<r;i++){
            int temp = a[0];
            for(int j=0;j<a.length-1;j++)a[j] = a[j+1];
            a[a.length-1] = temp;
        }
        return a;
    }
    private static int[] rightRotate(int[] a, int r) {
        if(r>a.length)return null;
        for(int i=0;i<r;i++){
            int temp = a[a.length-1];
            for(int j=a.length-1;j>0;j--)a[j] = a[j-1];
            a[0] = temp;
        }
        return a;
    }
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
