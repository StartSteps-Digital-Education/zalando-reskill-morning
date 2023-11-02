package org.startsteps.week9.day02.binarytree.exercises;

public class Exercise {

    public static void main(String[] args) {
//        exercise2();
//        exercise3();
//        exercise4();
    }

    public static void exercise2(){
        // Creating the root node
        TreeNode root = new TreeNode(1);

        // Manually adding children to the root node
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Adding children to the left child of root
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Adding children to the right child of root
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Print the structure of the tree
        printTree(root);
    }

    public static void exercise3(){
        BinaryTree tree = new BinaryTree();

        /* Let's create following BST
                5
               / \
              3   7
             / \   \
            2   4   8
        */
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);

        // Print in-order traversal of the BST
        tree.printTree(tree.root);
    }

    public static void exercise4(){
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);

        // Search for different values
        System.out.println("Is 4 in the tree? " + tree.search(4));  // Should return true
        System.out.println("Is 6 in the tree? " + tree.search(6));  // Should return false
    }

    // Method to print the tree in pre-order traversal

    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }

        // Print the current node's data
        System.out.print(node.data + " ");

        // Recursively print left subtree
        printTree(node.left);

        // Recursively print right subtree
        printTree(node.right);
    }
}
