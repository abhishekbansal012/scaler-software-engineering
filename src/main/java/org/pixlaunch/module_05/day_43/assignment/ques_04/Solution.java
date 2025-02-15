package org.pixlaunch.module_05.day_43.assignment.ques_04;

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level
            ArrayList<Integer> childElement = new ArrayList<>();

            int count = 0; // Counter to track processed nodes at the current level
            while (count < levelSize) { // Process all nodes at the current level
                TreeNode node = queue.poll();
                childElement.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count++;
            }
            result.add(childElement);
        }
        return result;
    }

}
