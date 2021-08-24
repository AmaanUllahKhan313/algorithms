package com.algos.tree;

class BTree{
    public BTree left;
    public BTree right;
    public int data;

    public BTree(int data) {
        this.data = data;
    }
}

public class HeightOfTree {
    private static boolean flag=true;

    public static void main(String[] args) {
        BTree root = initializeTree();
        BTree root2 = initializeTree2();
      /*  System.out.println(getDiameter(root));
        System.out.println(getTreeHeight(root));*/
      //  printLeftView(root,1);
        System.out.println(isIdentical(root,root2));
    }
    public static boolean isIdentical(BTree root1, BTree root2)
    {
        // Code Here
        if(root1==null && root2 ==null)
            return flag;
        else
            return root1.data==root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    private static BTree initializeTree() {
        BTree root = new BTree(1);
        root.left = new BTree(2);
        root.right = new BTree(3);
        root.left.left = new BTree(4);
        root.left.left.right = new BTree(9);
        root.left.left.right.right = new BTree(10);
        root.left.left.left = new BTree(8);
        root.left.right = new BTree(5);
        root.right.left = new BTree(6);
        root.right.right = new BTree(7);
        return root;

    }

    private static BTree initializeTree2() {
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
    private static int getDiameter(BTree bTree) {
        if(bTree==null)
            return 0;
        int lheight = getTreeHeight(bTree.left);
        int rheight = getTreeHeight(bTree.right);
        return Math.max(+1+rheight+lheight,Math.max(getDiameter(bTree.left),getDiameter(bTree.right)));

    }
    private static int getTreeHeight(BTree bTree) {
        if (bTree == null)
            return 0;
        return Math.max(getTreeHeight(bTree.left),getTreeHeight(bTree.right))+1;
    }
    static int max_level=0;
    private static void printLeftView(BTree bTree,int level) {
        if(bTree == null) return;
        if (max_level < level) {
            System.out.print(" " + bTree.data);
            max_level = level;
        }
        printLeftView(bTree.left,level+1);
        printLeftView(bTree.right,level+1);
    }
    private static void printRightView(BTree bTree,int level) {
        if(bTree == null) return;
        if (max_level < level) {
            System.out.print(" " + bTree.data);
            max_level = level;
        }
        printLeftView(bTree.right,level+1);
        printLeftView(bTree.left,level+1);
    }
}
