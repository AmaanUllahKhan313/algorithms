package com.algos.arrays;

public class Largest01SubArray {
    public static void main(String[] args) {
        int[]  a = {1,1,0,0,1,1,1,1,1,0,0,0,0,0};
//        int[] a = {1, 0, 1, 1, 1, 0, 0};
        printLargestSubarray(a);
    }

    private static void printLargestSubarray(int[] a) {
        int l_ptr =-10 , r_ptr = -10;
        int new_l_ptr = -1, new_r_ptr = -1;
        int l_count = 0 , r_count = 0;
        int old_count =0 , new_count = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0 ) r_count++;
            else l_count++;

            if (l_count != 0 && r_count != 0) {
                if (l_count != r_count) {
                    new_r_ptr = i;
                    new_l_ptr = i - ((Math.min(l_count,r_count)-1) * 2 +1);
                    new_count = Math.min(l_count,r_count) * 2;
                    if (new_count > old_count && i == a.length-1) {
                        l_ptr = new_l_ptr;
                        r_ptr = new_r_ptr;
                        old_count = new_count;
                    }
                } else {
                    if (r_ptr == i - ((l_count * 2 - 1))-1) {
                        r_ptr = i;
                    } else {
                        r_ptr = i;
                        l_ptr = i - (l_count * 2 -1);
                    }
                    old_count = r_ptr-l_ptr+1;
                    new_l_ptr = new_r_ptr = new_count = l_count = r_count = 0;
                }

            }
        }
        System.out.println("Subarray is from index: "+l_ptr+ " to "+r_ptr);
    }
}
