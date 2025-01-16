package org.pixlaunch.module_05.day_41.assignment.ques_03;

import java.util.ArrayList;

public class Solution {
    public int hasPathSum(TreeNode A, int B) {

        // Base case: if the tree is empty, there's no path
        if (A == null) {
            return 0;
        }

        // Check if the current node is a leaf and its value equals the remaining sum
        if (A.left == null && A.right == null && A.val == B) {
            return 1;
        }

        // Recursively check the left and right subtrees with the reduced sum
        int remainingSum = B - A.val;
        int leftResult = hasPathSum(A.left, remainingSum);
        int rightResult = hasPathSum(A.right, remainingSum);

        // Return 1 if any subtree returns 1, otherwise return 0
        return (leftResult == 1 || rightResult == 1) ? 1 : 0;
    }
}
