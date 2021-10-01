package com.algos.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] a = {3, 0, 0, 2, 0, 4};
        int area = getTrappedWaterArea(a);
        System.out.println("Area is :" + area);
    }

    public static int getTrappedWaterArea(int[] a) {
        int[] msr = new int[a.length];
        int[] msl = new int[a.length];
        int[] min = new int[a.length];
        int area = 0;
        msr[0] = a[0];
        msl[a.length - 1] = a[a.length - 1];
        for (int i = 1; i < a.length; i++)
            if (a[i] < msr[i - 1]) msr[i] = msr[i - 1];
            else msr[i] = a[i];
        for (int i = a.length - 2; i >= 0; i--)
            if (a[i] < msl[i + 1]) msl[i] = msl[i + 1];
            else msl[i] = a[i];
        for (int i = 0; i < a.length; i++) min[i] = Math.min(msr[i], msl[i]);
        for (int i = 0; i < a.length; i++) area = area + min[i] - a[i];
        return area;
    }
}
