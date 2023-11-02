package org.startsteps.week9.day02.binarytree.exercises;

public class TreeNode {
    // Integer data field
    int data;

    // References to left and right children
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;  // Setting left child reference to null
        this.right = null; // Setting right child reference to null
    }
}