package com.algos.tree;

public class MaxPathSum {
    private static int max =  Integer.MIN_VALUE;
    public static void main(String[] args) {
        System.out.println(maxPathSum(BTree.initializeTree()));
    }
    public static int maxPathSum(BTree root) {
        helper(root);
        return max;
    }
    static int helper(BTree root) {
        if (root == null) return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        max = Math.max(max, root.data + left + right);
        return root.data + Math.max(left, right);
    }
}
