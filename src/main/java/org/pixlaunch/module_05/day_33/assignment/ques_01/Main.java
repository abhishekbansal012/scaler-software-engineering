package org.pixlaunch.module_05.day_33.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayA = new ArrayList<>(List.of(5, 7, 7, 8, 8, 10));
        int B = 8;
        Solution solution = new Solution();
        System.out.println(solution.searchRange(arrayA,B));

    }
}
