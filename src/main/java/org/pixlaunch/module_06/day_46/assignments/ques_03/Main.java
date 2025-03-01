package org.pixlaunch.module_06.day_46.assignments.ques_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        ArrayList<Integer> A = new ArrayList<>(List.of(2,3,5,6,10));
        //System.out.println(solution.solve(A,2));
        System.out.println(solution2.solve(A,2));
    }
}
