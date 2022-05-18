package com.algos.arrays;

import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int sum = 9;
        int[] a = {-1,0,1,2,-1,-4};
        int sum = 23;
        System.out.println(threeSum(a).toArray());
       /* if (threeSum(a)) {
            System.out.println("TRIPLET FOUND!");
        } else {
            System.out.println("TRIPLET NOT FOUND");
        }*/
    }
    private static boolean get3Sum(int[] a, int sum) {
        Arrays.sort(a);
        for (int first = 0; first < a.length ; first++) {
            int second=1,last=a.length-1;
            if (sum==a[first]+a[second]+a[last])
                return true;
            else
            if (sum>a[first]+a[second]+a[last])
                second++;
            else
            if (sum<a[first]+a[second]+a[last])
                last--;
            if(second==last){
                first++;
                second=first+1;
                last=a.length-1;
            }
        }
        return false;
    }
    private void hashMapImplementation(){
        //TODO - hashmap implementation for triplets sum
    }
    private static boolean isTripletSumFound(int[] a, int sum) {
        Arrays.sort(a);
        int cachedSum = sum, tripletCount = 3;
        for (int i = a.length - 1; i >= 0; i--) {
            if (cachedSum - a[i] > 0 || (cachedSum - a[i] == 0 && tripletCount - 1 == 0)) {
                tripletCount--;
                cachedSum -= a[i];
                System.out.println(a[i]);

            }
            if (tripletCount == 0) {
                return true;
            }
        }
        return false;
    }
    public static List<List<Integer>> threeSum(int[] a) {
        Set<List<Integer>> res  = new HashSet<>();
        if(a.length==0) return new ArrayList<>(res);
        Arrays.sort(a);
        for (int first = 0; first < a.length-2 ; first++) {
            int second=first+1,last=a.length-1;

            while(second<last){
                int sum1 = a[first]+a[second]+a[last];
                if (0==sum1){                           res.add(Arrays.asList(a[first],a[second++],a[last--]));
                }
                else
                if (0>sum1)
                    second++;
                else
                if (0<sum1)
                    last--;
            }
        }
        return new ArrayList(res);
    }
}
