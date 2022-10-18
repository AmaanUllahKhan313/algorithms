package com.algos.dp;

public class MinJumpsRequired {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }
    public static boolean canJump(int[] nums) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > curr) {
                return false;
            }
            curr = Math.max(curr, i + nums[i]);
        }
        return true;
    }
}
