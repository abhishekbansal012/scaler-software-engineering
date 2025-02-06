package org.pixlaunch.module_04.day_19.assignment.ques_01;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        if (A <= 0) {
            return matrix;
        }



        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                row.add(0);
            }
            matrix.add(row);
        }

        int i=0,j=0,num=1;

        if (A == 1) {
            matrix.get(i).set(j, 1);
            return matrix;
        }

        while(A>1) {
            for (int k = 1; k < A; k++) {
                matrix.get(i).set(j++, num++);
            }

            for (int k = 1; k < A; k++) {
                matrix.get(i++).set(j, num++);
            }


            for (int k = 1; k < A; k++) {
                matrix.get(i).set(j--, num++);
            }

            for (int k = 1; k < A; k++) {
                matrix.get(i--).set(j, num++);
            }
            i++;j++;
            A=A-2;
            if(A==1) {
                matrix.get(i).set(j, num++);
            }
        }
        return matrix;
    }
}
