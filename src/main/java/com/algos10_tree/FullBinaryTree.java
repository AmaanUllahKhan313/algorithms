package com.algos10_tree;

public class FullBinaryTree {
    public static boolean isFullBinaryTree(_1BTree root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            return isFullBinaryTree(root.left) &&
                    isFullBinaryTree(root.right);
        }
        return false;
    }

    public static void main(String[] args) {
        _1BTree root = new _1BTree(1);
        root.left = new _1BTree(2);
        root.right = new _1BTree(3);
        root.left.left = new _1BTree(4);
        root.left.right = new _1BTree(5);
        root.right.left = new _1BTree(6);
        root.right.right = new _1BTree(7);
        System.out.println(isFullBinaryTree(root)); // true
    }
}
