package org.pixlaunch.module_05.day_41.assignment.ques_02;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(A, result);
        return result;

    }

    private void preorderHelper(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        // Visit the current node
        result.add(node.val);

        // Traverse the left subtree
        preorderHelper(node.left, result);

        // Traverse the right subtree
        preorderHelper(node.right, result);
    }
}