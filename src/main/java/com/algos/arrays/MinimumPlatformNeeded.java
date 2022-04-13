package com.algos.arrays;

import java.util.Arrays;

public class MinimumPlatformNeeded {
    public static void main(String[] args) {
        int arrivalTrains [] = { 900, 940, 950, 1100, 1500, 1800 };
        int departureTrains [] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(getNumberOfPlatformNeeded(arrivalTrains,departureTrains));
    }

    private static int getNumberOfPlatformNeeded(int[] arrivalTrains, int[] departureTrains) {
        Arrays.sort(arrivalTrains);
        Arrays.sort(departureTrains);
        int platform=1;int result=1;
        int i=1;int j=0;
        while (i<arrivalTrains.length&&j<departureTrains.length){
            if(arrivalTrains[i]<=departureTrains[j]){
                platform++;
                i++;
            } else if (arrivalTrains[i]>departureTrains[j]){
                platform--;
                j++;
            }
            result=Math.max(result,platform);
        }
        return result;
    }
}
