package org.pixlaunch.module_04.day_30.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayA = new ArrayList<>(List.of(6, 8, 9));
        Solution solution = new Solution();
        System.out.println(solution.solve(arrayA));

    }
}
