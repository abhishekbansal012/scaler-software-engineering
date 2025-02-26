package org.pixlaunch.module_06.day_55.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> A = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2));
        System.out.println(solution.longestConsecutive(A));
    }
}
