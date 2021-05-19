package com.algos.recursion;

public class NumberOfSubsets {
    public static void main(String[] args) {
        String input = "ab";
        String output = "";
        printNumberOfSubset(output,input);
    }

    private static void printNumberOfSubset(String output, String input) {
        if(input.equals("")){
            if(output.equals("")) System.out.print("\"\",");
            else System.out.print(output+",");
            return;
        }

        char firstChar = input.charAt(0);
        input = input.substring(1);
        printNumberOfSubset(output,input);
        printNumberOfSubset(output+firstChar,input);
    }
}
