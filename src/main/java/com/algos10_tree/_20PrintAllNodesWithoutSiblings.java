package com.algos10_tree;

public class _20PrintAllNodesWithoutSiblings {
    public static void main(String[] args){
        _1BTree root = _1BTree.initializeTree();
        printAllNodesWithoutSiblings(root);
    }

    private static _1BTree printAllNodesWithoutSiblings(_1BTree root) {
        if (root == null)
            return root;
        if (root.left == null && root.right != null)
            System.out.println(root.right.data);
        if (root.right == null && root.left != null)
            System.out.println(root.left.data);
        if (root.left != null)
            printAllNodesWithoutSiblings(root.left);
        if (root.right != null)
            printAllNodesWithoutSiblings(root.right);
        return root;
    }
}
