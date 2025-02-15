package org.pixlaunch.module_05.day_43.assignment.ques_02;

public class Main {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.left.left = new TreeNode(3);
        Solution solution = new Solution();
        System.out.println(solution.isBalanced(A));  // Pretty print tree

    }
}
