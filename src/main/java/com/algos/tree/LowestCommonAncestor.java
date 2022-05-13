package com.algos.tree;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        BTree root = BTree.initializeTree();
        System.out.println(lowestCommonAncestor(root,root.left,root.right).data);
    }
    public static BTree lowestCommonAncestor(BTree root, BTree p, BTree q) {
        if (root == null || root == p || root == q) return root;
        BTree left = lowestCommonAncestor(root.left, p, q);
        BTree right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
