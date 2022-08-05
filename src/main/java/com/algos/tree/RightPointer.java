package com.algos.tree;

public class RightPointer {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {}
        public Node(int _val) {
            this.val = _val;
        }
    };
    public static Node initializeTree2() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.right = new Node(9);
        root.left.left.right.right = new Node(10);
        root.left.left.left = new Node(15);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;

    }
    public static void main(String[] args) {
        RightPointer.inorder(connect(RightPointer.initializeTree2()));
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+"\t" + "#"+ root.next + "#");
        inorder(root.right);
    }
    public static Node connect(Node root) {
        if(root == null) return root;
        helper(root.left, root.right);
        return root;
    }

    static void helper(Node node1, Node node2){
        if(node1 == null) return;
        node1.next = node2;
        helper(node1.left, node1.right);
        helper(node2.left, node2.right);
        helper(node1.right, node2.left);
    }
}
