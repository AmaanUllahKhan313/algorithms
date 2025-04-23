package com.algos10_tree;

public class NoSibling {
    public static void main(String[] args){
        Sibling.Node root = Sibling.getTree();
        printAllNodesWithoutSiblings(root);
    }

    private static Sibling.Node printAllNodesWithoutSiblings(Sibling.Node root) {
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
