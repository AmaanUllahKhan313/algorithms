package com.algos01_arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a={1,3,3,4,3,8,3,3,8,3};
        System.out.println(getMajorityElement(a));
    }

    private static int getMajorityElement(int[] a) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i]))map.put(a[i],1);
            else if(map.get(a[i])+1>Math.floor(a.length/2))return a[i];
            else map.put(a[i],map.get(a[i])+1);
        }
        return -1;
    }
}
