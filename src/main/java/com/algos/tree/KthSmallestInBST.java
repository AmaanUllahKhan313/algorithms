package com.algos.tree;

public class KthSmallestInBST {
    public static void main(String[] args) {
        System.out.println(kthSmallest(BTree.initializeTree(),3));
    }
    public static int kthSmallest(BTree root, int k) {
        int count = countNodes(root.left);
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k-1-count); // 1 is counted as current node
        }

        return root.data;
    }

    public static int countNodes(BTree n) {
        if (n == null) return 0;

        return 1 + countNodes(n.left) + countNodes(n.right);
    }
}
