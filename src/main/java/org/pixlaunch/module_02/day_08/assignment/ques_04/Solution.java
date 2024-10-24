package org.pixlaunch.module_02.day_08.assignment.ques_04;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {

        return  printSubArray(A,B,C);

    }

    private ArrayList<Integer> printSubArray(ArrayList<Integer> A, int b, int c) {
        ArrayList<Integer> retArr = new ArrayList<>();

        if(b>A.size()) {
            return retArr;
        }

        for (int i=b; i<=c;i++) {
            retArr.add(A.get(i));
        }
        return retArr;
    }


}
