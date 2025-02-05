package org.pixlaunch.module_05.day_33.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayA = new ArrayList<>(List.of(1,3,5,6));
        ArrayList<Integer> arrayB = new ArrayList<>(List.of(1,4,9));
        int B = 5;
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(arrayB,B));

    }
}
