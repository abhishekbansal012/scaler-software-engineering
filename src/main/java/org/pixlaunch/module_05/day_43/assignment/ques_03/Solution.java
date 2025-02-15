package org.pixlaunch.module_05.day_43.assignment.ques_03;

import java.util.ArrayList;

public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        ArrayList<Integer> path = new ArrayList<>();
        return hasPathSumHelper(A, B, path)? 1:0;
    }

    private static boolean hasPathSumHelper(TreeNode node, int sum, ArrayList<Integer> path) {
        if (node == null) {
            return false;
        }
        path.add(node.val);
        // Check if it's a leaf node and the sum equals target sum
        if (node.left == null && node.right == null && sum == node.val) {
            return true;
        }
        // Recur for left and right subtrees with updated sum
        boolean leftHasPath = hasPathSumHelper(node.left, sum - node.val, new ArrayList<>(path));
        boolean rightHasPath = hasPathSumHelper(node.right, sum - node.val, new ArrayList<>(path));

        return leftHasPath || rightHasPath;
    }
}
