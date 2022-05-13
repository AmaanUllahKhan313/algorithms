package com.algos.tree;

class BTree{
    public BTree left;
    public BTree right;
    public int data;
    public BTree(int data) {
        this.data = data;
    }
    public static void main(String[] args) {
        BTree root = initializeTree();
        BTree root2 = initializeTree2();
        System.out.println(getTreeHeight(root));
    }

    public static BTree initializeTree() {
        BTree root = new BTree(5);
        root.left = new BTree(3);
        root.right = new BTree(8);
        root.left.left = new BTree(2);
        root.left.right = new BTree(4);
        //root.left.left.right.right = new BTree(10);
        //  root.left.left.left = new BTree(8);
        //  root.left.right = new BTree(5);
        root.right.left = new BTree(7);
        root.right.right = new BTree(9);
        return root;

    }

    public static BTree initializeTree2() {
        BTree root = new BTree(1);
        root.left = new BTree(2);
        root.right = new BTree(3);
        root.left.left = new BTree(4);
        root.left.left.right = new BTree(9);
        root.left.left.right.right = new BTree(10);
        root.left.left.left = new BTree(15);
        root.left.right = new BTree(5);
        root.right.left = new BTree(6);
        root.right.right = new BTree(7);
        return root;

    }

    public static int getTreeHeight(BTree bTree) {
        if (bTree == null)
            return 0;
        return Math.max(getTreeHeight(bTree.left),getTreeHeight(bTree.right))+1;
    }

}
