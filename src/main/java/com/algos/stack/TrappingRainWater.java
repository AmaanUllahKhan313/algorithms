package com.algos.stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] a = {3, 0, 0, 2, 0, 4};
        int area = getTrappedWaterArea(a);
        System.out.println("Area is :" + area); /*

                       .__.
        .__.           .  .
        .  . 1 4 .7_.8_.  .
        .  . 2 5 .  .9 .  .
        .__._3.6_.__.10.__.
        */
    }

    public static int getTrappedWaterArea(int[] a) {
        int[] msr = new int[a.length];
        int[] msl = new int[a.length];
        int area = 0;
        msr[0] = a[0];
        msl[a.length - 1] = a[a.length - 1];
        for (int i = 1; i < a.length; i++)
            msr[i] = Math.max(msr[i - 1],a[i]);
        for (int i = a.length - 2; i >= 0; i--)
            msl[i] = Math.max(msl[i + 1],a[i]);
        for (int i = 0; i < a.length; i++)
            area = area + Math.min(msr[i], msl[i]) - a[i];
        return area;
    }
}
