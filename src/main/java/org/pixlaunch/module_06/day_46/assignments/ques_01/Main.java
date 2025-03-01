package org.pixlaunch.module_06.day_46.assignments.ques_01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        print2DArrayList(solution.solve(5));

    }

    public static void print2DArrayList(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }
    }
}
