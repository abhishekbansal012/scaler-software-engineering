package org.pixlaunch.module_05.day_34.assignments.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> A= new ArrayList<>(List.of(4, 5, 6, 7, 0, 1, 2, 3));
        int B = 4;
        Solution solution = new Solution();
        System.out.println(solution.search(A,B));


    }
}