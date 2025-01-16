package org.pixlaunch.module_05.day_41.assignment.ques_01;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> result = new ArrayList<>();
        inorderHelper(A, result);
        return result;
    }

    private void inorderHelper(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inorderHelper(node.left, result);

        // Visit the current node
        result.add(node.val);

        // Traverse the right subtree
        inorderHelper(node.right, result);
    }

}
