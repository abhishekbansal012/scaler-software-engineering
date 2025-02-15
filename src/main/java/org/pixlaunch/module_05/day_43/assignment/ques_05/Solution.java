package org.pixlaunch.module_05.day_43.assignment.ques_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null) {return result;}

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level

            int count = 0; // Counter to track processed nodes at the current level
            while (count < levelSize) { // Process all nodes at the current level
                TreeNode node = queue.poll();
                if(count==levelSize-1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {

                    queue.add(node.right);
                }
                count++;
            }
        }
        return result;
    }
}
