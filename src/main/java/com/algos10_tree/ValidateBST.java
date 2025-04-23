package com.algos10_tree;

public class ValidateBST {
    public static void main(String[] args) {
        BTree root = new BTree(3);
        root.left = new BTree(2);
        root.right = new BTree(5);
        root.left.left = new BTree(1);
        root.left.right = new BTree(4);
        System.out.println(new ValidateBST().isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
    public boolean isValidBST(BTree root, long min, long max) {
        if (root==null)
            return true;
        if (root.data <= min || root.data >= max)
            return false;
        return isValidBST(root.left,   min, root.data) &&
                isValidBST(root.right, root.data, max);
    }
}
