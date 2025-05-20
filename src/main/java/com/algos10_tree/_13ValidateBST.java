package com.algos10_tree;

public class _13ValidateBST {
    public static void main(String[] args) {
        _1BTree root = new _1BTree(3);
        root.left = new _1BTree(2);
        root.right = new _1BTree(5);
        root.left.left = new _1BTree(1);
        root.left.right = new _1BTree(4);
        System.out.println(new _13ValidateBST().isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
    public boolean isValidBST(_1BTree root, long min, long max) {
        if (root==null)
            return true;
        if (root.data <= min || root.data >= max)
            return false;
        return isValidBST(root.left,   min, root.data) &&
                isValidBST(root.right, root.data, max);
    }
}
