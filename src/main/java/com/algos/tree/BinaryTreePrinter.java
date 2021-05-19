package com.algos.tree;

import java.io.PrintStream;

public class BinaryTreePrinter {

    private BinarySearchTree tree;

    public BinaryTreePrinter(BinarySearchTree tree) {
        this.tree = tree;
    }

    private String traversePreOrder() {

        if (tree == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(tree.getValue());

        String pointerRight = "└──";
        String pointerLeft = (tree.getRight() != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, tree.getLeft(), tree.getRight() != null);
        traverseNodes(sb, "", pointerRight, tree.getRight(), false);

        return sb.toString();
    }

    private void traverseNodes(StringBuilder sb, String padding, String pointer, BinarySearchTree node,
                               boolean hasRightSibling) {

        if (node != null) {

            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);

        }

    }

    public void print(PrintStream os) {
        os.print(traversePreOrder());
    }

}