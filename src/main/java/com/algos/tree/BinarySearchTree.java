package com.algos.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    BinarySearchTree left;
    BinarySearchTree right;
    int value;

    public BinarySearchTree(BinarySearchTree left, BinarySearchTree right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
    public boolean insert(int value){
        if(this.value>value){
            if(right!=null)insert(value);
            else new BinarySearchTree(value);
        }
        return false;
    }
    public static int height(BinarySearchTree root){
        if(root == null)return  0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void printAllNodes(BinarySearchTree parent){
        Queue<BinarySearchTree> queue= new LinkedList<BinarySearchTree>();
        ((LinkedList<BinarySearchTree>) queue).add(parent);
        while(!queue.isEmpty()){
            BinarySearchTree temp = queue.poll();
            System.out.print(temp+"\t");
            if(temp.left!=null){
                ((LinkedList<BinarySearchTree>) queue).add(temp.left);
            }
            if(temp.right!=null){
                ((LinkedList<BinarySearchTree>) queue).add(temp.right);
            }
        }
    }
    public static void display(BinarySearchTree root){
        int height = height(root);
        for(int i=1;i<=height;i++){
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    private static void printGivenLevel(BinarySearchTree root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getValue()+"\t");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value+"";
    }

    public static void inorder(BinarySearchTree root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.getValue()+"\t");
        inorder(root.right);
    }
    public static void preorder(BinarySearchTree root){

        if(root == null) return;
        System.out.print(root.getValue()+"\t");
        preorder(root.left);
        preorder(root.right);
    }
    public static  void postorder(BinarySearchTree root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.getValue()+"\t");
    }
    public static void inorderUsingStack(Stack stack, BinarySearchTree root){
        if(root == null)return;
        stack.push(root);
        inorderUsingStack(stack,root.left);
        BinarySearchTree node = (BinarySearchTree) stack.pop();
        System.out.print(node.getValue()+"\t");
        inorderUsingStack(stack,node.right);
    }
}
