package org.pixlaunch.module_05.day_41.assignment.ques_04;

public class Solution {

    public int solve(TreeNode A) {

        int wholeTreeSum = wholeTreeSum(A);

        // If Whole tree sum is not even then it cannot be divided into two equal parts
        if(wholeTreeSum %2 !=0) {
            return 0;
        }

        //check if there is any subtree with sum wholeTreeSum/2
        MutableBoolean ans = new MutableBoolean(false);
        sum(A, ans, wholeTreeSum);

        if (ans.value) {
            return 1;
        }

        return 0;
    }


    private int wholeTreeSum(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return node.val + wholeTreeSum(node.left) + wholeTreeSum(node.right);
    }


    int sum(TreeNode root, MutableBoolean ans, int totalSum) {

        if(root == null) {
            return 0;
        }

        int leftSum = sum(root.left, ans, totalSum);
        int rightSum = sum(root.right, ans, totalSum);

        if(leftSum == totalSum/2 || rightSum == totalSum/2) {
            ans.value = true;
        }
        return root.val + leftSum + rightSum;

    }
}

class MutableBoolean {
    public boolean value;

    public MutableBoolean(boolean value) {
        this.value = value;
    }
}
