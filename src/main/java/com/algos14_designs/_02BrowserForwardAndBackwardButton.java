package com.algos14_designs;

import java.util.Stack;

public class _02BrowserForwardAndBackwardButton {
    static String current_state_url = "";
    static Stack<String>
            forward_stack = new Stack<>();
    static Stack<String>
            backward_stack = new Stack<>();
    static void visit_new_url(String url){
        if (current_state_url != ""){
            backward_stack.add(
                    current_state_url);
        }
        current_state_url = url;
    }
    static void forward(){
        if (forward_stack.isEmpty() ||
                current_state_url ==
                        forward_stack.peek()){
            return;
        }else{
            backward_stack.add(current_state_url);
            current_state_url = forward_stack.peek();
            forward_stack.pop();
        }
    }
    static void backward(){
        if (backward_stack.isEmpty() ||
                current_state_url ==
                        backward_stack.peek()){
        } else {
            forward_stack.add(
                    current_state_url);
            current_state_url =
                    backward_stack.peek();
            backward_stack.pop();
        }
    }
    public static void main(String[] args){
        String url = "google.com";
        visit_new_url(url);
        System.out.print("Current URL is: " +
                current_state_url +
                " \n");
        url = "yahoo.com";
        visit_new_url(url);
        System.out.print("Current URL is: " +
                current_state_url +
                " \n");
        backward();
        System.out.print("Current URL after pressing" +
                " Backward button is: " +
                current_state_url + " \n");
        forward();
        System.out.print("Current URL after pressing" +
                " Forward button is: " +
                current_state_url + " \n");
        url = "amazon.com";
        visit_new_url(url);
        System.out.print("Current URL is: " +
                current_state_url +
                " \n");
        forward();
        System.out.print("Current URL after pressing" +
                " Forward button is: " +
                current_state_url + " \n");
        backward();
        System.out.print("Current URL after pressing" +
                " Backward button is: " +
                current_state_url + " \n");
    }
}