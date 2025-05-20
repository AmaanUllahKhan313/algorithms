package com.algos10_tree;

import java.util.LinkedList;
import java.util.Queue;

public class _1PrintTreeWithoutRecursion {
    public static void main(String[] args) {
        printAllNodes(_1BTree.initializeTree());
    }
    public static void printAllNodes(_1BTree parent){
        Queue<_1BTree> queue= new LinkedList<_1BTree>();
        ((LinkedList<_1BTree>) queue).add(parent);
        while(!queue.isEmpty()){
            _1BTree temp = queue.poll();
            System.out.print(temp+"\t");
            if(temp.left!=null){
                ((LinkedList<_1BTree>) queue).add(temp.left);
            }
            if(temp.right!=null){
                ((LinkedList<_1BTree>) queue).add(temp.right);
            }
        }
    }
}
