package org.pixlaunch.module_06.day_55.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, -2, 1, 2));
        System.out.println(solution.solve(A));
    }
}
