package org.pixlaunch.module_05.day_43.assignment.ques_03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(5);

        A.left = new TreeNode(4);
        A.right = new TreeNode(8);


        A.left.left = new TreeNode(11);
        A.left.left.left = new TreeNode(7);
        A.left.left.right = new TreeNode(2);


        A.right.left = new TreeNode(13);
        A.right.right = new TreeNode(4);

        A.right.right.right = new TreeNode(1);
        int B =22;
        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(A,B));  // Pretty print tree

    }
}
