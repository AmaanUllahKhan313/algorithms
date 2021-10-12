package com.algos.slidingwindow;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Arrays.stream(getSubArrayWithGivenSum(new int [] {1,5,6,4,3,2,7,8},9)).forEach(x->System.out.print(x+" "));
    }

    private static int [] getSubArrayWithGivenSum(int[] ints,int sum) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        while (start!=ints.length-1) {
            if(sum==currentSum){
                return  Arrays.copyOfRange(ints, start, end);
            }
            if (currentSum<sum){
                currentSum+=ints[end];
                end++;
            } else if(currentSum>sum){
                currentSum-=ints[start];
                start++;
            }
        }
        return  Arrays.copyOfRange(ints, start, end);
    }
}
