package com.algos15_dynamicprogramming;

public class _06PalindromePartition {
    public static void main(String[] args) {
        String input = "ababbbabbababa";
        System.out.println(getMinPalindromePartition(input,0,input.length()-1));
    }

    private static int getMinPalindromePartition(String input, int i, int j) {
    if(i>=j || isPalindrome(input.substring(i,j+1)))
        return 0;
    int result = Integer.MAX_VALUE,count ;
        for (int k = i; k < j; k++) {
            count = getMinPalindromePartition(input, i, k)
                    + getMinPalindromePartition(input, k + 1, j) + 1;
            result = Math.min(result, count);
        }
        return result;
    }

    private static boolean isPalindrome(String input) {
        return input.equals(new StringBuffer(input).reverse().toString());
    }
}
