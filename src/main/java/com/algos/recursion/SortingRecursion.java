package com.algos.recursion;

import java.util.ArrayList;

public class SortingRecursion {
    public static void main(String[] args) {
        int[] a = {6,5,4,1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a)
        {
            list.add(i);
        }
        System.out.println(list);
        recursiveSort(list);
        System.out.println(list);


    }

    private static void recursiveSort(ArrayList<Integer> a) {
        if(a.size() == 1) return;
        int temp = a.get(a.size()-1);
        a.remove(a.size()-1);
        recursiveSort(a);
        insert(a,temp);
    }

    private static void insert(ArrayList<Integer> a, int temp) {
        if(a.size() ==0 || a.get(a.size()-1)<= temp) {
            a.add(temp);
            return;
        }
        int val = a.get(a.size()-1);
        a.remove(a.size()-1);
        insert(a,temp);
        a.add(val);
    }
}
