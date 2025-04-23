package com.algos3_stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        System.out.println(new PostfixToInfix().evalRPN(("4 13 5 / +").split(" ")));
    }

    private static String postFixToInfix(String postfix) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < postfix.length(); i++) {
            if (isOperand(postfix.charAt(i))){
                stack.push(postfix.charAt(i)+"");
            } else {
                stack.push("(" + stack.pop() + postfix.charAt(i) + stack.pop() + ")");
            }
        }
        return stack.pop();
    }
    public int evalRPN(String[] postfix) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < postfix.length; i++) {
            if (isOperand(postfix[i])){
                stack.push(Integer.parseInt(postfix[i]));
            } else {
                int secondNumber =  stack.pop();
                int firstNumber  =  stack.pop();
                stack.push(performOperation(firstNumber,secondNumber, postfix[i]));
            }
        }
        return stack.pop();
    }

    private static boolean isOperand(char charAt) {
        return charAt>='a'&&charAt<='z'||charAt>='A'&&charAt<='Z';
    }
    private static boolean isOperand(String charAt) {
        return charAt.matches("-?\\d+(\\.\\d+)?");
    }
    public static int performOperation(int number1, int number2, String operator){
        if (operator.equals("+")){
            return number1+number2;
        }
        else if (operator.equals("-")){
            return number1-number2;
        }
        else if (operator.equals("*")){
            return number1*number2;
        }
        else{
            return number1/number2;
        }
    }
}

