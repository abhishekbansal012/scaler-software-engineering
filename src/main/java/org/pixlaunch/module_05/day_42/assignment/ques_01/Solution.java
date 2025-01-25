package org.pixlaunch.module_05.day_42.assignment.ques_01;

public class Solution {

    public int isValidBST(TreeNode node) {
        boolean result =  validateBST(node, Long.MIN_VALUE, Long.MAX_VALUE);

        if(result) {
            return 1;
        }

        return 0;

    }

    private boolean validateBST(TreeNode node, long minValue, long maxValue) {

        if(node == null) {
            return true;
        }

        if(node.val<= minValue || node.val>=maxValue) {
            return false;
        }

        boolean f1 = validateBST(node.left, minValue, node.val);
        boolean f2 = validateBST(node.right, node.val, maxValue);

        return f1 && f2;
    }


}
