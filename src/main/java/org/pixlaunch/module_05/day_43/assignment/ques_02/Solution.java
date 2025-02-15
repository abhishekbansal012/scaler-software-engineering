package org.pixlaunch.module_05.day_43.assignment.ques_02;

public class Solution {
    public int isBalanced(TreeNode A) {
        return checkHeight(A) != -1 ? 1 : 0;
    }

    private static int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
