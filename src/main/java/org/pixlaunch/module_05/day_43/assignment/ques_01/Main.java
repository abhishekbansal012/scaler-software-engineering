package org.pixlaunch.module_05.day_43.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> B = new ArrayList<>(List.of(2,1,3));

        Solution solution = new Solution();
        System.out.println(solution.buildTree(A, B));  // Pretty print tree

    }
}
