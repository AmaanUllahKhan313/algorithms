package com.algos.recursion;

public class PermutationChangeCase {
    public static void main(String[] args) {
        String input = "ab";
        String output = "";
        changeCasePermuation(output,input);
    }

    private static void changeCasePermuation(String output, String input) {
        if(input.equals("")){
            System.out.print(output+",");
            return;
        }
        char firstChar = input.charAt(0);
        input = input.substring(1);
        changeCasePermuation(output+firstChar,input);
        changeCasePermuation(output+(""+firstChar).toUpperCase(),input);

    }
}
