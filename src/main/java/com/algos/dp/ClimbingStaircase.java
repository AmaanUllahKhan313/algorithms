package com.algos.dp;

public class ClimbingStaircase {
    public static void main(String[] args) {
        int stairCase  = 5;
        System.out.println(countPossibleWaysToClimbStairCase(stairCase));
    }
    private static int countPossibleWaysToClimbStairCase(int stairCase) {
        if (stairCase==0)
            return 0;
        if (stairCase==1)
            return 1;
        if (stairCase==2)
            return 2;
        return countPossibleWaysToClimbStairCase(stairCase-1)
                + countPossibleWaysToClimbStairCase(stairCase-2);
    }
}
