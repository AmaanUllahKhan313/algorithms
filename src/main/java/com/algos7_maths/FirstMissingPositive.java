package com.algos7_maths;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums [] = {3,4,-1,1};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            num--; // -1 for zero index based array (so the number 1 will be at pos 0)
            if (nums[num] > 0) { // prevents double negative operations
                nums[num] = -1 * nums[num];
            }
        }
        // 3. find the first cell which isn't negative (doesn't appear in the array)
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
