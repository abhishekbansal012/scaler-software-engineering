package org.pixlaunch.module_04.day_19.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> valueOfN = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> row2 = new ArrayList<>(List.of(4,5,6));
        ArrayList<Integer> row3 = new ArrayList<>(List.of(7,8,9));
        valueOfN.add(row1);
        valueOfN.add(row2);
        valueOfN.add(row3);

        int B=2;
        Solution solution = new Solution();
        System.out.println(solution.solve(valueOfN,B));

    }
}
