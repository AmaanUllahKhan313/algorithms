package com.algos.recursion;

public class NumberOfSubsets_Unique {
    public static void main(String[] args) {
        String input = "aab";
        String output = "";
        String recorder = "";
        generateUniqueNumberOfSubsets(output,input,recorder);
    }

    private static String generateUniqueNumberOfSubsets(String output, String input,String recorder) {
        if(input.equals("")){
            if(output.equals("")){
                System.out.print("\"\",");
                recorder = recorder+"\"\",";
            }
            else {
                if(!recorder.contains(","+output+","))
                System.out.print(output+",");
                recorder = recorder+output+",";
            }
            return recorder;
        }

        char firstChar = input.charAt(0);
        input = input.substring(1);
        recorder = generateUniqueNumberOfSubsets(output,input,recorder);
        recorder = generateUniqueNumberOfSubsets(output+firstChar,input,recorder);
        return recorder;
    }
}
