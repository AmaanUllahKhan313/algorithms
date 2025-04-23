package com.algos1_arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsHavingSum {
    public static void main(String[] args) {
        System.out.println(getPairs(new Integer[]{3, 3, 3, 3},6));
    }

    private static int getPairs(Integer[] ints,int sum) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int count=0;
        for (int i = 0; i < ints.length; i++) {
            map.put(ints[i],null==map.get(ints[i])?1:(((Integer)map.get(ints[i]))+1));
        }
        for(Integer num:map.keySet()) {
            int first = num;
            int firstCount = map.get(first);
            int second = sum - first;
            if (firstCount > 0 && map.containsKey(second) && map.get(second) > 0) {
                int secondCount = map.get(second);
                int sumCount = firstCount * secondCount;
                if(first==second) {
                    //when both numbers are same then
                    //number of ways to pick 2 elements out of n = nC2
                    sumCount = firstCount*(firstCount-1)/2;
                }
                count += sumCount;
                map.put(first, 0);
                map.put(second, 0);
            }
        }
        return count;
    }

}
