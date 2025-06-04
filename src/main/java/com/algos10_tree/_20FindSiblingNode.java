package com.algos10_tree;



public class _20FindSiblingNode {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        int data_one = 2;
        System.out.print(CheckIfNodesAreSiblings(root,
                data_one
        ).data);
    }
    static _1BTree CheckIfNodesAreSiblings(_1BTree root,int data_one){
        if (root == null)
            return root;
        if (root.left != null && root.right != null){
            if (root.left.data == data_one )
                return root.right;
            if (root.right.data == data_one )
                return root.left;
        }
        if (root.left != null)
            CheckIfNodesAreSiblings(root.left,data_one);
        if (root.right != null)
            CheckIfNodesAreSiblings(root.right,data_one);
        return root;
    }

}

