package org.pixlaunch.module_05.day_42.assignment.ques_02;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] A = new int[]{10, 20, 30, 40, 50};
        Solution solution = new Solution();
        System.out.println(solution.sortedArrayToBST(A));

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
