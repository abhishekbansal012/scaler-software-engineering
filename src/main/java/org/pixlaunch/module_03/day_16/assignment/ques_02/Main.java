package org.pixlaunch.module_03.day_16.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> parentArray = new ArrayList<>();
        ArrayList<Integer> arrayOfA = new ArrayList<>(List.of(1,2));
        ArrayList<Integer> arrayOfB = new ArrayList<>(List.of(3,4));

        parentArray.add(arrayOfA);
        parentArray.add(arrayOfB);

        Solution solution = new Solution();
        solution.solve(parentArray);

    }
}
