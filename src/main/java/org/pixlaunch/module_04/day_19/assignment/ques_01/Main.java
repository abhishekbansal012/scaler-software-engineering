package org.pixlaunch.module_04.day_19.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int B=5;
        Solution solution = new Solution();
        printMatrix(solution.generateMatrix(B));

    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }
}
