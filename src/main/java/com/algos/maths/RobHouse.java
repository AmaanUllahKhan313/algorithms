package com.algos.maths;

public class RobHouse {
    public static void main(String[] args) {
        int moneyInHouse [] = {2,7,9,3,1};
        System.out.println(rob(moneyInHouse));
    }
    public static int rob(int[] num) {
        int prevNo = 0;
        int prevYes = 0;
        for (int n : num) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}
