package com.algos10_tree;

import java.util.Arrays;

public class _2CreateBST {
    public static void main(String[] args) {
        int ints [] =  {2, 1, 3, 4};
        Arrays.sort(ints);
        BinarySearchTree.preorder(getBST(ints,0,ints.length-1));
    }
    private static BinarySearchTree getBST(int[] ints, int start, int end) {
        if (start>end)
            return null;
        int mid = (start + end) / 2;
        BinarySearchTree node = new BinarySearchTree(ints[mid]);
        node.left=getBST(ints,start,mid-1);
        node.right=getBST(ints,mid+1,end);
        return node;
    }
}
