package org.pixlaunch.module_03.day_13.assignment.ques_05;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        int rowSize = A.size();
        int colSize = A.get(0).size();

        //Marking columns to -1
        for(int i=0;i<rowSize;i++) {
            boolean isZero =false;
            for(int j=0;j<colSize;j++) {
               if(A.get(i).get(j) == 0) {
                   isZero = true;
                   break;
               }
            }
            if(isZero) {
                for(int k=0;k<colSize;k++) {
                    if(A.get(i).get(k) != 0) {
                        A.get(i).set(k, -1);
                    }
                }
            }
        }

        //Marking rows to -1
        for(int i=0;i<colSize;i++) {
            boolean isZero =false;
            for(int j=0;j<rowSize;j++) {
                if(A.get(j).get(i) == 0) {
                    isZero = true;
                    break;
                }
            }
            if(isZero) {
                for(int k=0;k<rowSize;k++) {
                    if(A.get(k).get(i) != 0) {
                        A.get(k).set(i, -1);
                    }
                }
            }
        }
        
        markElementsToZero(A);
        return A;

    }

    private void markElementsToZero(ArrayList<ArrayList<Integer>> A) {
        int rowSize = A.size();
        int colSize = A.get(0).size();

        for(int i=0;i <rowSize; i++) {
            for(int j=0;j<colSize;j++) {
                if(A.get(i).get(j) == -1) {
                    A.get(i).set(j, 0);
                }
            }
        }
    }


}
