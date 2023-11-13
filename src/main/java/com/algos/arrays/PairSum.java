package com.algos.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    static int findPairs(int arr[], int n, int x)
    {

        int l = 0, r = n - 1;
        int result = 0;

        while (l < r)
        {
            if (arr[l] + arr[r] <= x)
            {
                result += (r - l);
                l++;
            }

            // Move to smaller value
            else
                r--;
        }

        return result;
    }

    public static boolean isPairPresent(int[] a, int sum){
        int l =0, r = a.length-1;
        Arrays.sort(a);
        System.out.println(a);
        while(l<r){
            if(a[l] + a[r]< sum){
                l +=1;
            }else if(a[l]+a[r] > sum){
                r-=1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static int[] hashPair(int[] a,int sum){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(sum-a[i])){
                return new int[]{i, map.get((sum-a[i]))};
            }else map.put(a[i],i);
        }
        return new int[]{};
    }
    // Driver method
    public static void main(String[] args)
    {

        int arr[] = {1,2,-2,-1,0};
        int n = arr.length;
        int x = -2;


//        System.out.print(findPairs(arr, n, x));
//        System.out.println(isPairPresent(arr,x));
        System.out.println(hashPair(arr,x));
    }
}
