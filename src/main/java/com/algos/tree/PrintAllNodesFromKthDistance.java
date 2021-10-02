package com.algos.tree;

public class PrintAllNodesFromKthDistance {
    public static void main(String[] args) {
        MirrorTree.Node root = new MirrorTree.Node(1);
        root.left = new MirrorTree.Node(2);
        root.right = new MirrorTree.Node(2);
        root.left.left = new MirrorTree.Node(3);
        root.left.right = new MirrorTree.Node(4);
        root.right.left = new MirrorTree.Node(5);
        root.right.right = new MirrorTree.Node(4);
        printKthNodes(root,1);
    }

    private static void printKthNodes(MirrorTree.Node root, int i) {
        if (root==null)
            return;
        if (i==0)
            System.out.println(root.data);
        printKthNodes(root.left,i-1);
        printKthNodes(root.right,i-1);
    }
}
