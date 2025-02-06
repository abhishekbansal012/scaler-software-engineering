package org.pixlaunch.module_04.day_20.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> row1= new ArrayList<>(List.of(1,3));
        ArrayList<Integer> row2= new ArrayList<>(List.of(2,6));
        ArrayList<Integer> row3= new ArrayList<>(List.of(8,10));
        ArrayList<Integer> row4= new ArrayList<>(List.of(15,18));
        A.add(row1);
        A.add(row2);
        A.add(row3);
        A.add(row4);

        Solution solution = new Solution();
        System.out.println(solution.solve(A));


    }
}