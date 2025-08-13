package com.algos10_tree;

public class _6PrintSumOfLeftLeaves {
    public static void main(String[] args) {
        System.out.println(getSumOfLeftLeaves(_1BTree.initializeTree()));
    }

    private static int getSumOfLeftLeaves(_1BTree root) {
        int ans = 0;
        if(root ==null) return 0;
        if(root.left!=null){
            if(root.left.left == null && root.left.right == null)
                ans += root.left.data;
            else ans += getSumOfLeftLeaves(root.left);
        }
        ans+=getSumOfLeftLeaves(root.right);
        return ans;
    }
}
