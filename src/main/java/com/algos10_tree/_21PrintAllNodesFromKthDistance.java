package com.algos10_tree;

public class _21PrintAllNodesFromKthDistance {
    public static void main(String[] args) {
        _17IsMirrorTree.Node root = new _17IsMirrorTree.Node(1);
        root.left = new _17IsMirrorTree.Node(2);
        root.right = new _17IsMirrorTree.Node(2);
        root.left.left = new _17IsMirrorTree.Node(3);
        root.left.right = new _17IsMirrorTree.Node(4);
        root.right.left = new _17IsMirrorTree.Node(5);
        root.right.right = new _17IsMirrorTree.Node(4);
        printKthNodes(root,1);
    }

    private static void printKthNodes(_17IsMirrorTree.Node root, int i) {
        if (root==null)
            return;
        if (i==0)
            System.out.println(root.data);
        printKthNodes(root.left,i-1);
        printKthNodes(root.right,i-1);
    }
}
