package com.algos.slidingwindow;

public class WaterContainer {
    public static void main(String[] args) {
        System.out.println(getMaxWater(new int[]{2,3,4,5,18,17,6}));
    }

    private static int getMaxWater(int[] ints) {
        int left=0;int right=ints.length-1;
        int max=0;
        while (left!=right){
            max = Math.max (max, (right-left) * Math.min(ints[left], ints[right]));
            if (ints[left] < ints[right]) {
                int i = left;
                while (ints[left] <= ints[i] ) left++;
            } else {
                int j = right;
                while (ints[j] >= ints[right] ) right--;
            }
        }
        return max;
    }
}
