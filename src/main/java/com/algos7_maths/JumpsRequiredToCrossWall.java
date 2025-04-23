package com.algos7_maths;

public class JumpsRequiredToCrossWall {
    public static void main(String[] args) {
        int height [] = {11, 10, 10, 9};
        int climb = 10;
        int slips=1;

        int jumps=0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > climb) {
                int h = height[i];
                while (h > climb) {
                    h = h - (climb - slips);
                    jumps++;
                }
            }
            jumps++;
        }
        System.out.println(jumps);
    }
}
