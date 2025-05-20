package com.algos10_tree;

public class _20PrintAllNodesWithoutSiblings {
    public static void main(String[] args){
        _20CheckIfTwoNodesAreSibling.Node root = _20CheckIfTwoNodesAreSibling.getTree();
        printAllNodesWithoutSiblings(root);
    }

    private static _20CheckIfTwoNodesAreSibling.Node printAllNodesWithoutSiblings(_20CheckIfTwoNodesAreSibling.Node root) {
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
