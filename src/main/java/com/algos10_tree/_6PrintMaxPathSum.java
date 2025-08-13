package com.algos10_tree;

public class _6PrintMaxPathSum {
    private int max =  Integer.MIN_VALUE;
    public static void main(String[] args) {
        System.out.println(new _6PrintMaxPathSum().maxPathSum(_1BTree.initializeTree()));
    }
    public int maxPathSum(_1BTree root) {
        helper(root);
        return max;
    }
    int helper(_1BTree root) {
        if (root == null) return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        max = Math.max(max, root.data + left + right);
        return root.data + Math.max(left, right);
    }
}
