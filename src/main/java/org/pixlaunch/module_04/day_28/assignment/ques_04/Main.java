package org.pixlaunch.module_04.day_28.assignment.ques_04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //[9,-20,-11,-8,-4,2,-12,14,1]
        ArrayList<Integer> A = new ArrayList<>(List.of(9,-20,-11,-8,-4,2,-12,14,1));
        Solution solution = new Solution();
        System.out.println(solution.solve(A));

    }
}
