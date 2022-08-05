package com.algos.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println("Found:"+binarySearch(a,2)[1]);
    }

    private static int [] binarySearch(int[] nums,int target) {
        int low = 0, high = nums.length-1;
        int [] res = {-1,-1};
        if(nums.length==1) return new int[]{1};
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) {
                res[0] = mid;
                while(nums[res[0]]!=nums[mid]){
                    mid++;
                }
                res[1] = mid;
                return res;
            }
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return res;
    }
}
