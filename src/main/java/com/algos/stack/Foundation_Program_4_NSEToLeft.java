package com.algos.stack;

import java.util.ArrayList;

public class Foundation_Program_4_NSEToLeft {
    public static void main(String[] args) {
        int[] a = {11,10,8,9,12,15,5,21,18};
        for(int element:a)
            System.out.print(element+"\t");
        System.out.println();
        ArrayList list = getNSEToLeft(a);
        System.out.println(list);
    }

    private static ArrayList getNSEToLeft(int[] a) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray(a.length);
        ArrayList list = new ArrayList();

        for(int i =0 ; i<a.length;i++){
            if(stack.isEmpty())list.add(-1);
            else if(stack.peek()<a[i])list.add(stack.peek());
            else if(stack.peek()>= a[i]){
                while(!stack.isEmpty() && stack.peek()>=a[i])stack.pop();
                if(stack.isEmpty())list.add(-1);
                else list.add(stack.peek());
            }
            stack.push(a[i]);
        }
        return list;
    }

}
