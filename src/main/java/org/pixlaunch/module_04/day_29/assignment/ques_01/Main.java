package org.pixlaunch.module_04.day_29.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayOfA = new ArrayList<>(List.of(4,7,9));
        ArrayList<Integer> arrayOfB = new ArrayList<>(List.of(2,11,19));

        Solution solution = new Solution();
        System.out.println(solution.solve(arrayOfA, arrayOfB));

    }
}
