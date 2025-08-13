package com.algos10_tree;

public class _16IsIdenticalTree {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        _1BTree root2 = _1BTree.initializeTree();
        System.out.println(isIdentical(root,root2));
    }
    public static boolean isIdentical(_1BTree root1, _1BTree root2){
        if(root1==null && root2 ==null)
            return true;
        else
            return root1.data==root2.data
                    && isIdentical(root1.left, root2.left)
                    && isIdentical(root1.right, root2.right);
    }
}
