package org.pixlaunch.module_03.day_13.assignment.ques_04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr =  new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        arr.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        row2.add(7);
        row2.add(8);
        arr.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(2);
        row3.add(3);
        row3.add(4);
        arr.add(row3);


        Solution solution = new Solution();
        System.out.println(solution.solve(arr));

    }
}
