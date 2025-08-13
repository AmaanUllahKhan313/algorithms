package com.algos11_searching;

import java.util.Arrays;

public class WoodCut {
    public static void main(String[] args) {
        System.out.println(cutWood(new int[]{1, 2, 1, 2},2));
    }

    private static int cutWood(int[] heights,int totalWoodNeeded) {
        Arrays.sort(heights);
        int low=0;int high=heights[heights.length-1];
        while (low<=high){
            int mid = (low+high)/2;
            int collectedWood = woodCollected(heights,mid);
            if (collectedWood==totalWoodNeeded)
                return mid;
            if(collectedWood>totalWoodNeeded)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    private static int woodCollected(int [] height, int mid) {
        int sum = 0;
        for (int i = height.length - 1; i >= 0; i--){
            if (height[i] - mid <= 0)
                break;
            sum += (height[i] - mid);
        }
        return sum;
    }
}
