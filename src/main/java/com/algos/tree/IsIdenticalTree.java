package com.algos.tree;

public class IsIdenticalTree {
    private static boolean flag=true;
    public static void main(String[] args) {
        BTree root = BTree.initializeTree();
        BTree root2 = BTree.initializeTree();
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
}
