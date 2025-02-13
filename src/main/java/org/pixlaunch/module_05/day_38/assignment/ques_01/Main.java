package org.pixlaunch.module_05.day_38.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>(List.of("2", "1", "+", "3", "*"));
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(A));

    }
}
