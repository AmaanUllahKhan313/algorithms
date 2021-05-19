package com.algos.arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfSubarray {
    public static void main(String[] args) {
        int[] a = {1, 4, 20, 3, 10, 5};
        int sum = 29;
        printSubArrayWithSum(a, sum);
    }

    private static void printSubArrayWithSum(int[] a, int sum) {
        int cur_sum = 0;
        int start = 0, end = -1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            cur_sum += a[i];
            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(cur_sum - sum)) {
                start = map.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            map.put(cur_sum, i);
        }
        if (end == -1) {
            System.out.println("No subarray found");
        }else{
            System.out.println("Subarray present from "+start+" till "+end);
        }
    }


    //My implementation
/*    private static void myPrintSubArrayWithSum(int[] a, int sum) {
        if(a[0] == sum) System.out.println("Sub array:"+a[0]);
        int i=0,j=1;
        int cSum = a[i] ;
        while (cSum != sum && j < a.length) {
            if (cSum < sum) {
                cSum += a[j];
                j++;
            } else {
                cSum-=a[i];
                i++;
            }
        }
        System.out.println("From "+(i+1)+" to "+(j));
        while (i+1 <= j) {
            System.out.println(a[i]);
            i++;
        }
    }*/
}
