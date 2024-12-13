package org.pixlaunch.module_04.day_29.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayOfA = new ArrayList<>(List.of(1, 4, 10, 2, 1, 5));

        Solution solution = new Solution();
        System.out.println(solution.solve(arrayOfA));

    }
}
