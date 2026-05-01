package com.algos10_tree;

import java.io.PrintStream;

public class _32PrintTreeVisualization {

    private _1BTree tree;

    public _32PrintTreeVisualization(_1BTree tree) {
        this.tree = tree;
    }

    public static void main(String[] args) {
        System.out.println(new _32PrintTreeVisualization(_1BTree.initializeTree()).traversePreOrder());
    }
    String traversePreOrder() {

        if (tree == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(tree.data);

        String pointerRight = "└──";
        String pointerLeft = (tree.right != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, tree.left, tree.right != null);
        traverseNodes(sb, "", pointerRight, tree.right, false);

        return sb.toString();
    }

    private void traverseNodes(StringBuilder sb, String padding, String pointer, _1BTree node,
                               boolean hasRightSibling) {

        if (node != null) {

            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.data);

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.right != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);

        }

    }

    public void print(PrintStream os) {
        os.print(traversePreOrder());
    }

}