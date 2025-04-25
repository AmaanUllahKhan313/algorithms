package com.algos4_slidingwindow;

public class _4MinSizeOfSubArrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println(getMinSubArrayWithGivenSum(new int [] {1,5,6,4,3,2,7,8},9));
    }

    private static int getMinSubArrayWithGivenSum(int[] ints,int sum) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        int min = Integer.MAX_VALUE;
        while (start!=ints.length-1) {
            currentSum+=ints[end];
            while(currentSum>=sum){
                min=Math.min(min,end-start+1);
                currentSum-=ints[start];
                start++;
            }
            end++;
        }
        return  min;
    }
}
