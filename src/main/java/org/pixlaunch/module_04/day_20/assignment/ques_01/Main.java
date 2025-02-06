package org.pixlaunch.module_04.day_20.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> A= new ArrayList<>(List.of(1,2,0));
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(A));


    }
}