package com.algos4_slidingwindow;

public class _4MinSizeOfSubArrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println(getMinSubArrayWithGivenSum(new int [] {2,3,1,2,4,3},7));
    }

    private static int getMinSubArrayWithGivenSum(int[] ints,int sum) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        int min = Integer.MAX_VALUE;
        while (start<=ints.length-1&&end<=ints.length-1) {
            currentSum+=ints[end];
            while(currentSum>=sum){
                min=Math.min(min,end-start+1);
                currentSum-=ints[start];
                start++;
            }
            end++;
        }
        return  min==Integer.MAX_VALUE?0:min;
    }
}
