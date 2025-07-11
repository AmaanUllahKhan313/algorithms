package com.algos09_recursion;

public class _1NumberOfSubsets_Unique {

    public static void main(String[] args) {
        String input = "abcd ";
        String output = "";
        printNumberOfSubset(input,output);
    }

    private static void printNumberOfSubset(String input, String output) {
        if (input.length() == 0)
        {
            System.out.print(output + "  ");
            return;
        }

        for(int i = 0 ;i < input.length(); i++)
        {
            char ch = input.charAt(i);
            String left_substr = input.substring(0, i);
            String right_substr = input.substring(i + 1);
            String rest = left_substr + right_substr;
            printNumberOfSubset(rest, output + ch);
        }
    }
}
