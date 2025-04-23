package com.algos10_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderBFS {
    public static void main(String[] args) {
        MirrorTree.Node root = new MirrorTree.Node(1);
        root.left = new MirrorTree.Node(2);
        root.right = new MirrorTree.Node(2);
        root.left.left = new MirrorTree.Node(3);
        root.left.right = new MirrorTree.Node(4);
        root.right.left = new MirrorTree.Node(5);
        root.right.right = new MirrorTree.Node(4);
        System.out.println(levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(MirrorTree.Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;

        Queue<MirrorTree.Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();

            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                MirrorTree.Node node=queue.poll();
                list.add(node.data);

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
