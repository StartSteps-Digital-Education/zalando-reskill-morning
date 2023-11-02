package org.startsteps.week9.day02.binarytree.exercises;

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Recursive method to search for a value
    private boolean searchRec(TreeNode root, int value) {
        // If the current node is null, the value is not found
        if (root == null) {
            return false;
        }

        // If the current node's data matches the target, return true
        if (root.data == value) {
            return true;
        }

        // Otherwise, recursively search in the left or right subtree
        if (value < root.data) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    // Method to insert a new value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive method to insert a new value
    private TreeNode insertRec(TreeNode root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        // Return the unchanged root node
        return root;
    }

    // Method to print the tree in in-order traversal
    public void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.data + " ");
            printTree(node.right);
        }
    }



}
