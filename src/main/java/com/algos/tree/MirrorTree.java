package com.algos.tree;

public class MirrorTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        System.out.println(isMirrorTree(root.left,root.right));
    }

    private static boolean isMirrorTree(Node left, Node right) {
        if(left==null && right==null)
            return true;
        return (left.data==right.data)
                && isMirrorTree(left.left,right.right)
                && isMirrorTree(left.right,right.left);
    }
}
