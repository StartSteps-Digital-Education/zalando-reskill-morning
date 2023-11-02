package org.startsteps.week9.day02.tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode {

    private String value;
    private List<TreeNode> childNodes;

    public TreeNode(String value) {
        this.value = value;
        this.childNodes = new LinkedList<>();
    }

    public void addChild(TreeNode childNode) {
        this.childNodes.add(childNode);
    }

    public void showTreeNodes() {
        System.out.print(this.value + " ");
        for (TreeNode child : this.childNodes) {
            child.showTreeNodes();
        }
    }

    public String getValue() {
        return value;
    }

    public List<TreeNode> getChildNodes() {
        return childNodes;
    }
}


class Main {


    public static void main(String[] args) {
        TreeNode rootTreeNode = new TreeNode("CEO");

        TreeNode vpNode = new TreeNode("Vice President");

        TreeNode managerNode = new TreeNode("Manager");

        TreeNode dev1Node = new TreeNode("Developer 1");
        TreeNode dev2Node = new TreeNode("Developer 2");
        TreeNode dev3Node = new TreeNode("Developer 3");

        rootTreeNode.addChild(vpNode);

        vpNode.addChild(managerNode);

        managerNode.addChild(dev1Node);
        managerNode.addChild(dev2Node);
        managerNode.addChild(dev3Node);

        rootTreeNode.showTreeNodes();
    }
}

