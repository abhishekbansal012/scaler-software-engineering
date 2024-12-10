package org.pixlaunch.module_04.day_18.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int A = 5;

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> b1 =  new ArrayList<>(List.of(1,2,10));
        ArrayList<Integer> b2 =  new ArrayList<>(List.of(2,3,20));
        ArrayList<Integer> b3 =  new ArrayList<>(List.of(2,5,25));
        B.add(b1);
        B.add(b2);
        B.add(b3);

        Solution solution = new Solution();
        System.out.println(solution.solve(A, B));

    }
}
