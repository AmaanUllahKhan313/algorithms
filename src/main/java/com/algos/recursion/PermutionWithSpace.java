package com.algos.recursion;

public class PermutionWithSpace {
    public static void main(String[] args) {
        String input = "BC";
        String output ="A";
        insertSpaces(output,input);
    }

    private static void insertSpaces(String output, String input) {
        if(input.equals("")){
            System.out.print(output+",");
            return;
        }
        char removedChar = input.charAt(0);
        input = input.substring(1);
        insertSpaces(output+"_"+removedChar,input);
        insertSpaces(output+removedChar,input);
    }
}
