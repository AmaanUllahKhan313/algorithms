package com.algos01_arrays;

public class FindLenghtOfString {
    public static void main(String[] args) {
        char [] str = "abcdefg".toCharArray();
        int count = 0;
        while(true){
            try{
                System.out.println(str[count]);
                count++;
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println("Total length of string: "+count);
    }
}
