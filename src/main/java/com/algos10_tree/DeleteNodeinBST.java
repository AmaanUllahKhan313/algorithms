package com.algos10_tree;

public class DeleteNodeinBST {
    public static void main(String[] args) {
        _1BTree root = new _1BTree(3);
        root.left = new _1BTree(2);
        root.right = new _1BTree(5);
        root.left.left = new _1BTree(1);
        root.left.right = new _1BTree(4);
        System.out.println(deleteNode(root,2));
    }

    private static _1BTree deleteNode(_1BTree root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            _1BTree minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    private static _1BTree findMin(_1BTree node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}
