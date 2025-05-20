package com.algos10_tree;

public class _5HeightOfTree {
    public static void main(String[] args) {
        int height = getHeight(_1BTree.initializeTree());
        System.out.println("Height of the tree :"+height);
    }

    public static int getHeight(_1BTree root) {
        if(root == null)return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public static int getTreeHeight(_1BTree a1BTree) {
        if (a1BTree == null)
            return 0;
        return Math.max(getTreeHeight(a1BTree.left),getTreeHeight(a1BTree.right))+1;
    }
}
