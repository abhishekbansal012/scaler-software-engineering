package org.pixlaunch.module_05.day_43.assignment.ques_04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        TreeNode A = new TreeNode(3);
        A.left = new TreeNode(9);
        A.right = new TreeNode(20);
        A.right.left = new TreeNode(15);
        A.right.right = new TreeNode(7);
        Solution solution = new Solution();
        print2DArrayList(solution.solve(A));  // Pretty print tree

    }

    public static void print2DArrayList(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }
    }
}
