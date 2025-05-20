package com.algos10_tree;


//AVL Tree
public class BalancedBTree {

    public static void main(String[] args) {
        System.out.println(isAVLTree(_1BTree.initializeTree()));
    }

    private static boolean isAVLTree(_1BTree root) {
        if(root == null) return true;
        return Math.abs(getHeight(root.left)
                - getHeight(root.right))<=1;
    }
    static int getHeight(_1BTree root) {
        if(root == null)return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
