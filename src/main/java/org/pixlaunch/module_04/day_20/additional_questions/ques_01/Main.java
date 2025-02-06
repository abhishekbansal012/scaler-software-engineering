package org.pixlaunch.module_04.day_20.additional_questions.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> row1= new ArrayList<>(List.of(1,3));
        ArrayList<Integer> row2= new ArrayList<>(List.of(6,9));
        A.add(row1);
        A.add(row2);


        ArrayList<Integer> B= new ArrayList<>(List.of(2,5));

        Solution solution = new Solution();
        System.out.println(solution.insert(A,B));


    }
}