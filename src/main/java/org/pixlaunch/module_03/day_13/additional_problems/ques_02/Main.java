package org.pixlaunch.module_03.day_13.additional_problems.ques_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayA = new ArrayList<>(List.of(1,-2,-3));
        ArrayList<Integer> arrayB = new ArrayList<>(List.of(-4,5,-6));
        ArrayList<Integer> arrayC = new ArrayList<>(List.of(-7,-8,9));
        List<ArrayList<Integer>> parentArray = new ArrayList<>();
        parentArray.add(arrayA);
        parentArray.add(arrayB);
        parentArray.add(arrayC);

        Solution solution = new Solution();
        System.out.println(solution.solve(parentArray));

    }
}
