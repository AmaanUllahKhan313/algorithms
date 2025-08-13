package com.algos10_tree;

public class _24LowestCommonAncestor {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        System.out.println(lowestCommonAncestor(root,root.left,root.right).data);
    }
    public static _1BTree lowestCommonAncestor(_1BTree root, _1BTree p, _1BTree q) {
        if (root == null || root == p || root == q) return root;
        _1BTree left = lowestCommonAncestor(root.left, p, q);
        _1BTree right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
