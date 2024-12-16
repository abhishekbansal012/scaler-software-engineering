package org.pixlaunch.module_03.day_16.assignment.ques_05;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> parentArray = new ArrayList<>();
        ArrayList<Integer> arrayOfA = new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> arrayOfB = new ArrayList<>(List.of(4,5,6));
        ArrayList<Integer> arrayOfC = new ArrayList<>(List.of(7,8,9));

        parentArray.add(arrayOfA);
        parentArray.add(arrayOfB);
        parentArray.add(arrayOfC);

        Solution solution = new Solution();
        solution.solve(parentArray);

    }
}
