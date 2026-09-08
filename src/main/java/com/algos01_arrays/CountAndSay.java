package com.algos01_arrays;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(8));
    }
    public static String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i < n; i++){
            s = countIdx(s);
        }
        return s;
    }

    public static String countIdx(String s){
        String sb = new String();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c) count++;
            else {
                sb+=count+""+c;
                c = s.charAt(i);
                count = 1;
            }
        }
        sb+=count;
        sb+=c;
        return sb;
    }
}