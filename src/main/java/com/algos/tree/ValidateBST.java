package com.algos.tree;

public class ValidateBST {
    public static void main(String[] args) {
        BTree root = BTree.initializeTree();
        System.out.println(new ValidateBST().isBST(root));
    }
    BTree prev;
    public boolean isBST(BTree node)
    {
        if (node != null)
        {
            if (!isBST(node.left))
                return false;

            if (prev != null && node.data <= prev.data )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
    }
}
