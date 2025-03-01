package org.pixlaunch.module_06.day_46.assignments.ques_01;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        setInitialArrayWithZero(resultMatrix,A);

        for(int i=0;i<A;i++) {
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    resultMatrix.get(i).set(j, 1);
                } else {
                    resultMatrix.get(i).set(j, resultMatrix.get(i-1).get(j-1) + resultMatrix.get(i-1).get(j));
                }
            }
        }
        return resultMatrix;
    }

    private void setInitialArrayWithZero(ArrayList<ArrayList<Integer>> resultMatrix, int capacity) {
        for(int row = 0;row<capacity;row++) {
            ArrayList<Integer> columnArray = new ArrayList<>();
            for(int column=0;column<capacity;column++) {
                columnArray.add(column,0);
            }
            resultMatrix.add(columnArray);
        }

    }
}
