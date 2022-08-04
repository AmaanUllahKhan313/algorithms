package com.algos.tree;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        System.out.println(getSumOfLeftLeaves(BTree.initializeTree()));
    }

    private static int getSumOfLeftLeaves(BTree root) {
        int ans = 0;
        if(root ==null) return 0;
        if(root.left!=null){
            if(root.left.left == null && root.left.right == null) ans += root.left.data;
            else ans += getSumOfLeftLeaves(root.left);
        }
        ans+=getSumOfLeftLeaves(root.right);
        return ans;
    }
}
