package org.pixlaunch.module_04.day_28.assignment.ques_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,0,1));
        int B = 1;
        Solution solution = new Solution();
        System.out.println(solution.solve(A,B));

    }
}
