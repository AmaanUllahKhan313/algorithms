package com.algos.tree;


//AVL Tree
public class BalancedBTree {

    public static void main(String[] args) {
        System.out.println(isAVLTree(BTree.initializeTree()));
    }

    private static boolean isAVLTree(BTree root) {
        if(root == null) return true;
        return Math.abs(getHeight(root.left)
                - getHeight(root.right))<=1;
    }
    static int getHeight(BTree root) {
        if(root == null)return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
