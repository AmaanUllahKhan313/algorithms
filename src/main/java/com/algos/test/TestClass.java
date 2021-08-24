package com.algos.test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;


public class TestClass {

    public static void main(String[] args) {

int arr [] =  {1, 0, 1, 1, 1, 0, 0};
        int max=0;
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            sum=arr[i]==0?-1:1;
            for (int j = i+1; j < arr.length; j++) {
            sum+=arr[j]==0?-1:1;
            if(sum==0&&max<j-i+1){
                max=j-i+1;

            }

            }
        }
        System.out.println(max);















/*

        int arr []  = {11,2,3};
        int maxCutSize = 25;
        getMaxCuts(arr,maxCutSize);
        System.out.println();

    }
//     0  1  2  3   ..  22  25



    private static void getMaxCuts(int[] arr, int maxCutSize) {
         int out [] [] = new int[arr.length] [maxCutSize];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; i < maxCutSize ; i++) {
                 out [i] [j] = Math.max(out [i] [j-1] , out [i-1] [j])+1;
            }
        }
*/


    }







































    public static void method(String[] args) throws IOException {
       int arr [] = {11,81,94,43,3};
        int sumOfSubArray = 0;
        int min = Integer.MAX_VALUE;
        List list = new ArrayList();
        int opsize = (int)Math.pow(2, arr.length);
        for (int counter = 1; counter < opsize; counter++)
        {
            for (int j = 0; j < arr.length; j++){
                if (BigInteger.valueOf(counter).testBit(j)){
                    System.out.print(arr[j]+" ");
                    if(min>arr[j])
                        min=arr[j];
                }
            }  System.out.println();
            sumOfSubArray+=min;
        }

        System.out.println(sumOfSubArray);


/*
String s="ana";
String t = "ana";



isAnagram("anan","nana");*/

        System.out.println(minDistance("ABCD","FORABZZZCXXXD"));



/*

        char [] s =  {'h','e','l','l','o'};
        int first=0;
        int last=s.length-1;
        char temp = 't';
        while(first==last || first<last){
            temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
        System.out.println(s);*/
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());*/

            //String out_ = Solve(N);
   /*       //  System.out.println(out_);
        }

        wr.close();
        br.close();*/
    }
 /*   static String Solve(int N){
        // Write your code here
    }*/
 public static boolean isAnagram(String s, String t) {
     int j=t.length();
     for(int i=0;i<=s.length();i++){
         if(s.charAt(i) != t.charAt(j-1))
             return false;
         j--;
     }
     return true;

 }
public static int getHamming(int x, int y){
    int count = Integer.toBinaryString(x).toCharArray().length-1;
    int counter = 0;
     while (count>=0){
         if (x + "".getBytes()[count] != x + "".getBytes()[count]) counter++;
         count--;
     }
     return counter;
}

    public static int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0)
                    continue;
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return s1.length() + s2.length() - 2 * dp[s1.length()][s2.length()];
    }

    static int maxSum(int arr[], int n, int k)
    {
        // n must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }
}