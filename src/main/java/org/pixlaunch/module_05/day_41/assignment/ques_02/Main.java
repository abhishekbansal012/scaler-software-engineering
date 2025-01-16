package org.pixlaunch.module_05.day_41.assignment.ques_02;

public class Main {

    public static void main(String[] args) {

        // Create tree nodes
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        printTree(root,0);
        Solution solution = new Solution();
        System.out.println(solution.preorderTraversal(root));
    }

    // Utility function to print the tree (preorder traversal with indentation)
    public static void printTree(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        // Indentation based on the level
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.val);
        printTree(node.left, level + 1);
        printTree(node.right, level + 1);
    }
}
