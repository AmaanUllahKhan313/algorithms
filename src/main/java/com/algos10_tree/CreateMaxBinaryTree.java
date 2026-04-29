package com.algos10_tree;

import java.util.Stack;

public class CreateMaxBinaryTree {
    public static void main(String[] args) {
        System.out.println(new _32PrintTreeVisualization(constructMaximumBinaryTree(new int []{3,2,1,6,0,5})).traversePreOrder());
    }
    public static  _1BTree constructMaximumBinaryTree(int[] nums) {
         Stack<_1BTree> st = new Stack<>();
        for(int num : nums){
            _1BTree cur = new _1BTree(num);
            while(!st.isEmpty() && st.peek().data < num){
                cur.left = st.pop();
            }
            if(!st.isEmpty())
                st.peek().right = cur;
            st.push(cur);
        }
        return st.firstElement();
    }
}