package org.pixlaunch.module_05.day_42.assignment.ques_04;

public class Solution {

    public int solve(TreeNode node, int B) {

        if(node == null) {
            return 0;
        }

        if(node.val == B) {
            return 1;
        }
        if(node.val<B) {
            return solve(node.right, B);
        }
        return solve(node.left, B);
    }

}
