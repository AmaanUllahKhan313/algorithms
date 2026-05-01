package com.algos10_tree;

public class _13ValidateBST {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
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
