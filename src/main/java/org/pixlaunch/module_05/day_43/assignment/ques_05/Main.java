package org.pixlaunch.module_05.day_43.assignment.ques_05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);

        A.left.left = new TreeNode(4);
        A.left.right = new TreeNode(5);

        A.right.left = new TreeNode(6);
        A.right.right = new TreeNode(7);

        A.left.left.left = new TreeNode(8);
        Solution solution = new Solution();
        print1DArrayList(solution.solve(A));  // Pretty print tree

    }

    public static void print1DArrayList(ArrayList<Integer> list) {
        for (int i =0;i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
