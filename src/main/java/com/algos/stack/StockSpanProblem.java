package com.algos.stack;

import java.util.ArrayList;
import java.util.Stack;

class ValueIndex{
    public int value;
    public int index;

    public ValueIndex(int value, int index) {
        this.value = value;
        this.index = index;
    }
}
public class StockSpanProblem {
    public static void main(String[] args) {
//        int[] a = {11,10,9,15,5,21,18};
        int[] a = {100, 80, 60, 70, 60, 75, 85};
        for(int element:a)
            System.out.print(element+"\t");
        System.out.println();
        //getNGEToLeft
        ArrayList list = getStocksSpan(a);
        System.out.println(list);
    }

    private static ArrayList getStocksSpan(int[] a) {
//        StackArrayImpl stack = new StackArrayImpl(a.length);
        Stack<ValueIndex> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList();
        for(int i =0 ; i<a.length;i++){
            if(stack.isEmpty())list.add(-1);
            else if(stack.peek().value>a[i])list.add(i-1);
            else if(stack.peek().value<= a[i]){
                while(!stack.isEmpty() && stack.peek().value<=a[i])stack.pop();
                if(stack.isEmpty())list.add(-1);
                else list.add(stack.peek().index);
            }
            stack.push(new ValueIndex(a[i],i));
        }
        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+"\t"); //[-1, 1, 2, -1, 4, -1, 6]
            if(list.get(i)!= -1)list.set(i,i-list.get(i));
        }
        return list;
    }
}
