package com.algos14_designs;

public class _06CarPooling {
    public static void main(String[] args) {
        int [][] startStopEndStopPassengerCount = new int[][]{{2,1,5},{3,3,7}};
        int carCapacity = 5;
        System.out.println(carPooling(startStopEndStopPassengerCount,carCapacity));
    }
    public static boolean carPooling(int[][] trips, int capacity) {
        int stops[] = new int[1001];
        for (int t[] : trips) {
            stops[t[1]] += t[0];
            stops[t[2]] -= t[0];
        }
        for (int i = 0; capacity >= 0 && i < 1001; ++i) capacity -= stops[i];
        return capacity >= 0;
    }
}
