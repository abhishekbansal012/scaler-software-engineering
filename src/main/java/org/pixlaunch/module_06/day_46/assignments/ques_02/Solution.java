package org.pixlaunch.module_06.day_46.assignments.ques_02;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            resultArray.add(countDivisors(A.get(i)));
        }
        return resultArray;
    }

    private int countDivisors(int n) {
        int count =0;

        for(int i=1;i*i<=n;i++) {
            if(n%i == 0) {
                if(i==n/i) {
                    count++;
                }
                else {
                    count+=2;
                }
            }
        }
        return count;
    }
}
