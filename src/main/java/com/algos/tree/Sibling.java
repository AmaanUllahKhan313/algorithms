package com.algos.tree;



public class Sibling {
    static class Node
    {
        int data;
        Node left, right;
    };
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;

        return (node);
    }
    static Node root = null;
    static Node CheckIfNodesAreSiblings(Node root,int data_one){
        if (root == null)
            return root;
        if (root.left != null && root.right != null){
            if (root.left.data == data_one )
                return root.right;
            if (root.right.data == data_one )
                return root.left;
        }
        if (root.left != null)
            CheckIfNodesAreSiblings(root.left,data_one);
        if (root.right != null)
            CheckIfNodesAreSiblings(root.right,data_one);
        return root;
    }
    public static void main(String[] args)
    {
        root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.right.left = newNode(5);
        root.right.right = newNode(6);
        root.left.left.right = newNode(7);
        int data_one = 2;
        System.out.print(CheckIfNodesAreSiblings(root,
                data_one
        ).data);
    }
}

