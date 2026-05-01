package com.algos04_slidingwindow;

public class _10WaterContainer {
    public static void main(String[] args) {
        System.out.println(getMaxWater(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    private static int getMaxWater(int[] ints) {
        int left=0;int right=ints.length-1;
        int max=0;
        while (left!=right){
            max = Math.max (max, (right-left) * Math.min(ints[left], ints[right]));
            if (ints[left] < ints[right]) {
                int i = left;
                while (left!=right&&ints[left] <= ints[i] ) left++;
            } else {
                int j = right;
                while (left!=right&&ints[j] >= ints[right] ) right--;
            }
        }
        return max;
    }
}
