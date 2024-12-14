package org.pixlaunch.module_03.day_16.assignment.ques_02;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public void solve(ArrayList<ArrayList<Integer>> A) {
        rotateArrayInPlace(A);
        printMatrix(A);

    }

    private void rotateArrayInPlace(ArrayList<ArrayList<Integer>> A) {

        for(int i=0;i <A.size();i++) {
            for(int j=i+1;j<A.size();j++) {
                int temp = A.get(j).get(i); //column value in temp
                A.get(j).set(i, A.get(i).get(j));
                A.get(i).set(j, temp); //Setting column value into row

            }
        }
        reverseRowsOfMatrix(A);
    }

    private void reverseRowsOfMatrix(ArrayList<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            Collections.reverse(A.get(i));
        }

    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
