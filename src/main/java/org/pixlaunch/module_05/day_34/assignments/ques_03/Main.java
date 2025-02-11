package org.pixlaunch.module_05.day_34.assignments.ques_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> A= new ArrayList<>(List.of(1, 3));
        ArrayList<Integer> B= new ArrayList<>(List.of(2));
        Solution solution = new Solution();
        System.out.println(solution.solve(A,B));


    }
}