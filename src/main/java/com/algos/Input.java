package com.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public static List takeInputStringsFromUser(){
        Scanner scanner
                = new Scanner(System.in);
        List<String> arrList = new ArrayList<String>();
        System.out.println("How many inputs do you want to enter?");
        int n = Integer.parseInt(scanner.next());
        System.out.println("Enter each input with enter");
        for (int i = 0; i <n ; i++) {
            arrList.add(scanner.next());
        }
        System.out.println("Input Ends processing started....");
        return arrList;
    }
    public static List takeInputIntegerFromUser(){
        Scanner scanner
                = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer>();;
        System.out.println("How many inputs do you want to enter?");
        int n = Integer.parseInt(scanner.next());
        System.out.println("Enter each input with enter");
        for (int i = 0; i <n ; i++) {
            arrList.add(Integer.parseInt(scanner.next()));
        }
        System.out.println("Input Ends processing started....");
        return arrList;
    }
}
