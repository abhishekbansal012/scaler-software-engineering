package org.pixlaunch.module_04.day_19.assignment.ques_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> valueOfN = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>(List.of(1,2));
        ArrayList<Integer> row2 = new ArrayList<>(List.of(3,4));
        valueOfN.add(row1);
        valueOfN.add(row2);

        Solution solution = new Solution();
        System.out.println(solution.solve(valueOfN));

    }
}
