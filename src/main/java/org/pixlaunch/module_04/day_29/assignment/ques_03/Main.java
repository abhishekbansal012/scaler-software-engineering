package org.pixlaunch.module_04.day_29.assignment.ques_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayOfA = new ArrayList<>(List.of(6, 3, 4, 2, 7, 2, 1));

        Solution solution = new Solution();
        System.out.println(solution.smallestNumber(arrayOfA));

    }
}
